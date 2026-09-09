class Solution {
    public int removeDuplicates(int[] nums) {
        // Handle empty array edge case
        if (nums.length == 0) {
            return 0;
        }
        
        int i = 0; // Slow pointer
        
        // Fast pointer j iterates through the array
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++; // Move the slow pointer forward
                nums[i] = nums[j]; // Update the next unique element
            }
        }
        
        // i is an index, so the count of unique elements is i + 1
        return i + 1;
    }
}