class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int missingc=arr[n-1]-n;
        if(missingc<k)
        {
            return (arr[n-1]+ k)-missingc;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                k++;
            }
            else
            break;

        }
        return k;
        
         

        
    }
}
