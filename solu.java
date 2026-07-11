import java.util.*;

class Solu {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start,
                           List<Integer> temp, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            temp.add(candidates[i]);

            // Same element can be used again, so pass i
            backtrack(candidates, target - candidates[i], i, temp, result);

            // Backtrack
            temp.remove(temp.size() - 1);
        }
    }
}