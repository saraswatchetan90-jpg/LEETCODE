class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
       if(n==0) {
        return true;
       }
       int i=0;
       int c=0;
       while(i<flowerbed.length){
        if(flowerbed[i]==1)
        i+=2;
       
       else{
        if((i==0 || flowerbed[i-1]==0) && ((i==flowerbed.length-1) || flowerbed[i+1]==0)){
            c++;
            i+=2;
        }
        else{
            i++;
        }
       }}
       if(c>=n){
        return true;
       }
       return false;
    }
}