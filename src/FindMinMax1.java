public class FindMinMax1 {
    public static void main(String[] args){
        int[] arr = {2, 9, 7, 4, 8};
        System.out.println("Before sorting: ");
        for(int elements: arr) {
            System.out.print( elements + " ");
        }
        System.out.println();

        int temp;
        for(int i= 0; i<arr.length; i++){
            for(int j = i; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for(int elements: arr){
            System.out.print(elements + " ");
        }
        System.out.println();
        System.out.println("The min value in this Integer Array is: " + arr[0]);
        System.out.println("The max value in this Integer Array is: " + arr[arr.length-1]);

        }
    }

