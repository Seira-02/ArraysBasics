import java.util.Arrays;
public class ArraySort {
    public static void main(String[] args){
        int[] arr = {10,8,17,6,100};
        System.out.println("Before Sorting");
        for(int i=1; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        System.out.println("After Sorting");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
