class Solution {
    public void moveZeroes(int[] nums) {
        int originalArrayLength = nums.length;
        int j = 0; // Pointer for the position to place the non-zero element

        // First pass: Move all non-zero elements to the front
        for (int i = 0; i < originalArrayLength; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Second pass: Fill the remaining positions with zeroes
        for (int i = j; i < originalArrayLength; i++) {
            nums[i] = 0;
        }
    }
}