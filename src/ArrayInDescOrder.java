public class ArrayInDescOrder {
    public static void main(String[] args){
        int[] arr = {2,4,7,9,3,6};
        for(int elements: arr){
            System.out.print(elements + " ");
        }
        int temp;
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j< arr.length; j++){
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array sorted in descending order: ");
        for(int elements: arr){
            System.out.print(elements + " ");
        }
    }
}
