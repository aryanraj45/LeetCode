class Solution {
    public int searchInsert(int[] nums, int target) {
        int star=0;
        int end=nums.length -1;
        int insert=0;
        while(star<=end)
        {
            int mid=star+(end-star)/2;
            if(nums[mid]<target){
            star=mid +1;
            insert=mid+1;
            }
            else if(nums[mid]>target)
            {
            end=mid-1;
            insert=mid-1;
            }else
            return mid;

        }
        return star;

    }
}
