class Solution {
    public void rotate(int[] nums, int k) {
        int arrayLength = nums.length;
        k = k % arrayLength; // Handle cases where k is greater than the length of the array
        for (int i = 0; i < k; i++) {
            int lastElement = nums[arrayLength - 1];
            // Shift elements to the right
            for (int j = arrayLength - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            // Place the last element at the front
            nums[0] = lastElement;
        }
    }
}