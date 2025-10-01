class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        
        
        // find the maximum pile (so we don't check speeds larger than needed)
        int maxPile = piles[0];
        for(int i = 1; i < n; i++){
            maxPile = Math.max(maxPile, piles[i]);
        }
        int low=1;
        int high=maxPile;
        while(low<=high)
        {
            int mid = low + (high - low) / 2;

            if(Totalhour(piles,mid)<=h)
            {
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return low;
    
    }
    long Totalhour(int[] piles, int i)
    {
        long sum=0;
        for(int j=0;j<piles.length;j++)
        {
            sum +=(long) Math.ceil((double) piles[j] / i);
        }
        return sum;
    }
    
}
