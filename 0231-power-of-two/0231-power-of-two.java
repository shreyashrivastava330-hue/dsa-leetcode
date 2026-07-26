class Solution {
    public boolean solve(int n, long currval){
        if(n==currval){
            return true;
        }
        if(currval>n){
            return false;
        }
        return solve(n, 2*currval);
    }
    public boolean isPowerOfTwo(int n) {
       long   currval=1; 
       return solve(n,currval);  
    }
}