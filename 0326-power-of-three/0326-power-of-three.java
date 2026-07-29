class Solution {
    public boolean solve(int n, long currval){
        if(n==currval){
            return true;
        }
        if(currval>n){
            return false;
        }
        return solve(n, 3*currval);
    }
    public boolean isPowerOfThree(int n) {
       if (n <= 0)
            return false;

        return solve(n, 1);
    }
}