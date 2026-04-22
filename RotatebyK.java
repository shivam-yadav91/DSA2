public class RotatebyK {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int k = 2;

        for(int r = 0; r < k; r++){
            int temp = arr[0];

            for(int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i+1];
            }

            arr[arr.length - 1] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
