class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int result[]=new int[nums1.length+nums2.length];
       for(int i=0;i<nums1.length;i++){
        result[i]=nums1[i];
       } 
       for(int i=0;i<nums2.length;i++){
        result[nums1.length+i]=nums2[i];
       }
       Arrays.sort(result);
       int n=result.length;
       double med=0;
       if(n%2==0){
         med=(result[n/2] + result[(n/2) - 1]) / 2.0;       }
    
    else{
        med=result[(n)/2];
    }
    return med;

}}