class Solution {
    long Mod= 1000000007;
    public long pow(long x, long n){
        if(n==0){
            return 1;
        }
        long half=pow(x,n/2);
        long ans=(half*half)%Mod;
        if(n%2==1){
            return (x*ans)%Mod;
        }
        return ans;

    }
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=(n+1)/2;   
        long ans= (pow(5,even)*pow(4,odd))%Mod;
        return (int)ans;    
    }
}