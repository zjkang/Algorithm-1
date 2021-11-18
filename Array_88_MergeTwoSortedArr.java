public class Array_88_MergeTwoSortedArr {
    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    //Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    //The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    //result HAS TO store in nums1
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];
        int nums1Index = 0;
        int nums2Index = 0;
        int resultIndex = 0;
        while ((nums1Index < m) && (nums2Index < n)) {
            if (nums1[nums1Index] <= nums2[nums2Index]) {
                result[resultIndex++] = nums1[nums1Index++];
            } else {
                result[resultIndex++] = nums2[nums2Index++];
            }
        }
        while (nums1Index < m) {
            result[resultIndex++] = nums1[nums1Index++];
        }
        while (nums2Index < n) {
            result[resultIndex++] = nums2[nums2Index++];
        }
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = result[i];
        }
    }
}
