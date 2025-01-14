import java.util.Scanner;
public class SumOfElements1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the values in array: ");
            arr[i] = sc.nextInt();
        }
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }

            System.out.println("The sum of the number is: " + sum);

    }
}
