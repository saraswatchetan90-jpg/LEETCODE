class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int c=0;
        for(int i=0;i<jewels.length();i++){
             for(int j=0;j<stones.length();j++){
               int b=jewels.charAt(i);
               int a=stones.charAt(j);
               if(a==b)
               {
                    c++;
                }
        }
        }
        return c;  
    }
}