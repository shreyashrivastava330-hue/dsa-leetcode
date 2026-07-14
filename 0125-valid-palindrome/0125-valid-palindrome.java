class Solution {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return f(s, 0);
    }

    private boolean f(String s, int i) {
        for(i=0;i<s.length()/2;i++){
            char start=s.charAt(i);
            char end = s.charAt(s.length()-i-1);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}