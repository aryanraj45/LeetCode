class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int result[]=new int[n];
        int pos=0 ,neg=0;
        int negative[]=new int[n];        
        int positive[]=new int[n];
        int p=0;
        int q=0;
        for(int num:nums)
        {
        if(num>0)
        positive[pos++]=num;
        else
        negative[neg++]=num;
        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            result[i]=positive[p++];
            else
            result[i]=negative[q++];

        }
        return result;
    }
}
