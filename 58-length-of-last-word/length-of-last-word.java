class Solution {
    public int lengthOfLastWord(String s) {
        String n=s.trim();
        int p=n.lastIndexOf(' ');
       return n.length()-p-1;
    }
}