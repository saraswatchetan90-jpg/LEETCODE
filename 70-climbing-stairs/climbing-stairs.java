class Solution {
    public int climbStairs(int n) {int f=1,s=1;
        for(int i=2;i<=n;i++){
           int temp=s;
           s+=f;
           f=temp;
        }
        return s;
    }
      
    }
