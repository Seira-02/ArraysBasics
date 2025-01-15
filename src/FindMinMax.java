import java.util.Arrays;
public class FindMinMax {
    public static void main(String[] args){
        int[] arr = {2, 9, 7, 4, 8};
        for(int element: arr){
            System.out.print(element + " ");
            Arrays.sort(arr);

        }
        System.out.println();
        System.out.println("Min value in this integer Array: " + arr[0]);
        System.out.println("Max value in this integer Array: " + arr[arr.length-1]);
    }
}
