public class ReplacingIndexElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 9, 3, 6};
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();

        for(int elements: arr){
            System.out.print(elements + " ");
        }
        System.out.println();
        int num = arr[3];
        for(int index = 0; index<arr.length; index++){
            if(arr[index] == num){
                arr[index] = 100;
            }
        }
        for(int elements:arr){
        System.out.print(elements + " ");
    }
    }
}
