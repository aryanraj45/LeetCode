class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        int m=goal.length();
        String s1= new String();

        if(n!=m)
        {
         return false;
        }
        for(int i=0;i<n;i++)
        {
            s1=s.substring(i) +s.substring(0,i);
            if(s1.equals(goal))
            {
                return true;
            }
        }
            return false;
    }
}

