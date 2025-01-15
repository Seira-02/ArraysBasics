public class CopyReverseArray {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        int[] reverseArr = new int[arr.length];

        for(int index = 0; index < arr.length; index++){
            reverseArr[arr.length-1 - index] = arr[index];
        }
        for (int element: arr){
            System.out.print(element + " ");
        }
        System.out.println();
        for(int element: reverseArr){
            System.out.print(element + " ");
        }

    }
}
