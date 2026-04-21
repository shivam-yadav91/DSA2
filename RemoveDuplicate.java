public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr = {1,2,3,3,4,5,6,6};

        int j = 0;  // pointer for unique elements

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }

        // print unique elements
        for(int i = 0; i <= j; i++){
            System.out.print(arr[i]);
        }
    }
}
