class Solution {
    public int splitArray(int[] nums, int m) {
        int low = 0, high = 0;
        for (int num : nums) {
            low = Math.max(low, num); 
            high += num;              
            
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canSplit(nums, m, mid)) {
                high = mid; 
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private boolean canSplit(int[] nums, int m, int maxSumAllowed) {
        int count = 1; 
        int currSum = 0;
        for (int num : nums) {
            if (currSum + num > maxSumAllowed) {
                count++;
                currSum = num;
                if (count > m) return false;
            } else {
                currSum += num;
            }
        }
        return true;
    }
}
