public class evenOddIndexSum {
    public static void main (String[] args){
        int[] arr = {10,20,30,40,50,60,70,80};
        int evenResult = 0;
        int oddResult = 0;
        System.out.println("Array Elements");

        for(int index = 0; index< arr.length; index++){
            System.out.print(arr[index]+ " ");

            if(index % 2 == 0){
                evenResult = evenResult + arr[index];
            }
            else{
                oddResult = oddResult + arr[index];
            }
        }
        System.out.println();
        System.out.println("Sum of even index element: " + evenResult);
        System.out.println("Sum of odd index elements: " + oddResult);
    }
}
