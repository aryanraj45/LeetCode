class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int b;
        for(int i=0;i<n;i++)
        {
            
        if (nums.length == 1) {
        return nums[0];
        }

            if(i==0)
            {
                if(nums[i]!=nums[i+1])
                return nums[i];
            }
            else if(i==n-1)
            {
                if(nums[i]!=nums[i-1])
                return nums[i];
            }
            else
            if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1])
         return nums[i];
        }
    
        return -1;
    }
}
