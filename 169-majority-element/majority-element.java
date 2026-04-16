class Solution {
    public int majorityElement(int[] nums) {
       int c=0;
       int d=0;
      for(int i=0;i<nums.length;i++){
       if(c==0){
        d=nums[i];
       }
       if(nums[i]==d){
        c++;
       }
       else{
       c--;

       }
       
      }
      return d;  
    }
}