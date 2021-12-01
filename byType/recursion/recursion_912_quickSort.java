public class quickSort {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums;
        }
        sortArray(nums, 0, nums.length - 1);
        return nums;
    }

    private void sortArray(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        } //base case, recursion exit
        int pivotPosition = partition(nums, left, right);
        sortArray(nums, left, pivotPosition - 1); //exclude pivot itself
        sortArray(nums, pivotPosition + 1, right);
    }

    //partition function is to look for PIVOT INDEX witch is leftBound
    private int partition(int[] nums, int left, int right) {
        int pivotIndex = left + (right - left) / 2;
        int pivot = nums[pivotIndex];
        int leftBound = left; // not "0"
        int rightBound = right - 1;
        swap(nums, pivotIndex, right);
        while (leftBound <= rightBound) {
            if (nums[leftBound] < pivot) {
                leftBound++;
            } else if (nums[rightBound] >= pivot) {
                rightBound--;
            } else {
                swap(nums, leftBound++, rightBound--);
            }
        }
        swap(nums, leftBound, right); //swap index, leftBound, not pivotIndex
        return leftBound; //return index, not nums[leftBound]
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
    public static void main(String[] args) {
        quickSort solution = new quickSort();

        int[] array = null;
        array = quickSort.sortArray(array);
        System.out.println(array);

        int[] array = new int[0];
        array = quickSort.sortArray(array);
        System.out.println(array);

        int[] array = new int[] {1, 2, 3, 4};
        array = quickSort.sortArray(array);
        System.out.println(array);
    }
}

