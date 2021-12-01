//int index = 0;
//start with i = 1; compare i with previous elemet
// if == -> move i
// if != -> assign nums[i] to nums[index] * need to increment index first
//return index + 1, because we start index from 0

public class Array_26_removeDuplicate {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                index++;
                nums[index] = nums[i];
            }
        }
        return index + 1;
    }
}

