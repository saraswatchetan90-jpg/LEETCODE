class Solution {
    public int maximumGap(int[] nums) {
          Arrays.sort(nums);
       int sum=0;
        for(int i = 1; i < nums.length; i++){
   sum = Math.max(sum, nums[i] - nums[i-1]);
}
        return sum;

    }
}