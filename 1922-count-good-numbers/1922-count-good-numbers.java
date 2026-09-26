class Solution {
    int M = 1_000_000_007;
    public int pow(long a , long b){
        if(b == 0) return 1;
        if(b % 2 == 0){
            return pow((a*a) % M,b/2)% M;
        }
        else{
            return (int)((a * pow(a , b-1))% M);
        }
    }
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long result = ((long)pow(5,even) * pow(4,odd)) % M;
        return (int) result;
    }
}