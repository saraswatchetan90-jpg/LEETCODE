class Solution {
    public boolean isPalindrome(String s) {
       String s1= s.toLowerCase();
        String str=s1.replaceAll("[^a-z0-9]","");
       String s2="";
        for(int i=0;i<str.length();i++){
            s2=str.charAt(i)+s2;}
        if(str.equals(s2)){
            return true;
        }
        else {
            return false;
        }}
    
}