public class mergeSort {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] nums, int left, int right) {
        if (left == right) {
            return new int[]{nums[left]};
        } //易错点，当left right相等时，创建一个新的array并return
        int mid = left + (right - left) / 2;
        int[] leftResult = mergeSort(nums, left, mid);
        int[] rightResult = mergeSort(nums, mid + 1, right);
        return merge(leftResult, rightResult);
    }

    private int[] merge(int[] leftResult, int[] rightResult) {
        int[] result = new int[leftResult.length + rightResult.length];
        int resultIndex = 0;
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < leftResult.length && rightIndex < rightResult.length) {
            if (leftResult[leftIndex] <= rightResult[rightIndex]) {
                result[resultIndex++] = leftResult[leftIndex++];
            } else {
                result[resultIndex++] = rightResult[rightIndex++];
            }
        }
        while (leftIndex < leftResult.length) {
            result[resultIndex++] = leftResult[leftIndex++];
        }
        while(rightIndex < rightResult.length) {
            result[resultIndex++] = rightResult[rightIndex++];
        }
        return result;
    }
}
