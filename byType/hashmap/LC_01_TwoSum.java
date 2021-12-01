import java.util.HashMap;

public class LC_01_TwoSum {
    //given array, and k, find if sum of two elements in array is k
    // 1. iterate array, and put every element in a map, key -> element, value -> index
    // 2. iterate array again to find match:
    //    2.1 for current element, use k - array[i] to find the other element we need
    //    2.2 use that element as KEY, map.containsKey(ele) to see if map has that element
    //    if yes: return new int[] {i, index of other element}
    //    if no : iterate to next element
    //    2.3 no result, return null

    public int[] twoSum (int[] array, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int targetNumber = k - array[i];
            if (map.containsKey(targetNumber) && map.get(targetNumber) != i) {
                return new int[] {i, map.get(targetNumber)};
            }
        }
        return null;
    }
}
