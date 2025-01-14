public class ArrayBasics2 {
    public static void main(String[] args){
        int i, min, max, sum;
        double avg;
        int arr[] = {10,40,30,20};
        max=min=sum=arr[0];
        for(i=1; i<arr.length; i++){
            sum+=arr[i];
            if(arr[i]>max){
                max= arr[i];
            }
            if(arr[i]<min){
                min= arr[i];
            }
        }
        avg=(double)sum/arr.length;
        System.out.println("This is the max value" + max);
        System.out.println("This is the min value" + min);
        System.out.println("This is the sum value" + sum);
        System.out.println("This is the avg value" + avg);
    }
}
