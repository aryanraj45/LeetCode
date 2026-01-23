class Solution { 
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int i = 0;
        
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];  // Move the unique value to the correct position
            }
        }
        
        // Print the modified array (only unique elements)
        for (int q = 0; q <= i; q++) {
            System.out.print(nums[q] + " ");
        }
        
        return i + 1; // Length of unique elements
    }
}