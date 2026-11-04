class Solution {
    public int mySqrt(int x) {
        if(x == 1 || x == 0) return x;
        int low = 0;
        int high = x;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(mid * mid == x)  return mid;
            else if(mid <= x/mid){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
}