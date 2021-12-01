import java.util.*;

public class AmazonFindSubsets {
    public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (nums == null) {
        return result;
    }
    List<Integer> prefix = new ArrayList<Integer>();
    findSubsets(nums, 0, prefix, result);
    return result;
}

    private void findSubsets(int[] nums, int index, List<Integer> prefix,                                          List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<Integer>(prefix));
            return;
        }
        prefix.add(nums[index]);
        findSubsets(nums, index + 1, prefix, result);
        prefix.remove(prefix.size() - 1);
        findSubsets(nums, index + 1, prefix, result);
    }
}
