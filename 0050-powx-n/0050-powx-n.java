class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn =n;
        if(nn<0){
            x = 1/x;
            nn = -1 * nn;
        }
        while(nn > 00){
            if(nn % 2 == 1){
                ans = ans * x;
                nn = nn -1;
            }else{
                x = x * x;
                nn = nn /2;
            }
        }
       
        return ans;
    }
}