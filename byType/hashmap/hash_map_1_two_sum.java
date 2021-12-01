import java.util.*;
/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] indices = new int[2]; //create a new array with size to store the answer
//        HashMap<Integer, Integer> map = new HashMap<>(); //create a new hashmap which will store result
//        for (int i = 0; i < nums.length; i++) {
//            int key_value = target - nums[i];
//            if ( map.containsKey(key_value) ){
//                indices[0] = i; //assign the index of the current number
//                indices[1] = map.get(key_value);
//                return indices; //returning the entire array
//            }
//            //insert hashmap
//            map.put( nums[i], i );
//        }
//        return null;
    }

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] {i ,map.get(complement)};
            }
        }
        return null;
    }
}

