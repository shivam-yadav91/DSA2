public class LinearSearch {

    // Step 1: Logic function
    public static int linearSearch(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

    // Step 2: Main method (execution starts here)
    public static void main(String[] args){

        // Step 3: Input
        int[] nums = {2, 3, 4, 5, 3};
        int target = 3;

        // Step 4: Function call
        int result = linearSearch(nums, target);

        // Step 5: Output
        System.out.println(result);
    }
}
