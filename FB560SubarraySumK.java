import java.util.*;

public class FB560SubarraySumK {
    public int subarraySum(int[] nums, int k) {
        //prefix sum
        //hashmap
        int result = 0;
        int sum = 0;
        HashMap<Integer, Integer> count = new HashMap<>();
        //one count pre sum is "0"
        count.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (count.containsKey(sum - k)) {
                result += count.get(sum - k);
            }
            count.put(sum, count.getOrDefault(sum, 0) + 1);
        }
        return result;
    }
}
