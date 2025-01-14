public class EvenOddSum {
    public static void main(String[] args){
        int[] arr = {13,12,15,17,20};
        int evenResult = 0;
        int oddResult = 0;

        System.out.println("Array Elements: ");
        for (int element: arr){
            System.out.print("Elements" + " ");
            if(element%2 == 0){
                evenResult = evenResult+element;
            }
            else{
                oddResult = oddResult + element;
            }
        }
        System.out.println();
        System.out.println("Sum of even Numbers: " + evenResult);
        System.out.println("Sum of odd Numbers: " + oddResult);

    }
}
