public class largestelement{
    public static void main(String[]args){
        int[] arr ={1,2,70,76,6};
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                
            }
        }
        System.out.println(max);
    }
}