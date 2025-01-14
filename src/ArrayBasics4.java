import java.util.*;
public class ArrayBasics4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the values in array: ");
            arr[i] = sc.nextInt();
        }
        int max= arr[0];
        int min = arr[0];
        int sum = arr[0];

        for(int i = 1; i<arr.length; i++){
            sum += arr[i];
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }

        }
        float avg = (float)sum/arr.length;

        System.out.println("The min of the number is: " + min);
        System.out.println("The max of the number is: " + max);
        System.out.println("The sum of the number is: " + sum);
        System.out.println("The avg of the number is: " + avg);

    }
}
