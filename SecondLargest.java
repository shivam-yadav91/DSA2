public class SecondLargest{
    public static void main(String[]agrs){
        int[] arr =  { 329,394,300,120};
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }

            else if(arr[i]< max && arr[i]> secondmax){
                secondmax = arr[i];
            }
        }
        System.out.println(secondmax);
    }
}