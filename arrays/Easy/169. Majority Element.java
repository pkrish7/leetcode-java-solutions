class Solution {
    public int majorityElement(int[] nums) {
        int arrayLength = nums.length;
        int majorityCount = arrayLength / 2;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        // Count occurrences of each element
        for (int i = 0; i < arrayLength; i++) {
            if (countMap.containsKey(nums[i])) {
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            } else {
                countMap.put(nums[i], 1);
            }
        }
        // Find the majority element
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > majorityCount) {
                return entry.getKey();
            }
        }
        return -1; // This line should never be reached for valid input
    }
}