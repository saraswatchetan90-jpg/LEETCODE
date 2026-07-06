class Solution {
    public int firstMissingPositive(int[] nums) {
      Arrays.sort(nums);
      int expected=1;
      for(int n:nums){
        if(n<expected)
        continue;
        if(n==expected)
        expected++;
       else if(n > expected)
        return expected;
      }
      return expected;
    }
}