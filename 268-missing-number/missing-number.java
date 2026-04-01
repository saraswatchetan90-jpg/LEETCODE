class Solution {
    public int missingNumber(int[] nums) {
  int add=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
{
    add+=nums[i];
}  
    int missing=n*(n+1)/2 -(add);
  return missing;
        
    }
}