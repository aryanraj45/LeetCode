import java.util.Arrays;
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int high = Arrays.stream(bloomDay).max().getAsInt();
        int low = Arrays.stream(bloomDay).min().getAsInt();
        
        if (m * k > n) {
            return -1;
        } int ans=-1;
        while(high>=low)
        {
            int mid=low+(high-low)/2;
            if (canMake(bloomDay, m, k, mid)) {
        ans = mid;
        high = mid - 1;    }
         else {
        low = mid + 1; 
    }
}
return ans;
        
    }
    private boolean canMake(int[] bloomDay, int m, int k, int day) {
    int bouquets = 0, flowers = 0;
    for (int b : bloomDay) {
        if (b <= day) {
            flowers++;
            if (flowers == k) {
                bouquets++;
                flowers = 0;
            }
        } else {
            flowers = 0;
        }
    }
    return bouquets >= m;
}

}
