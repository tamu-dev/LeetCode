class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n<=1) return 0;
        int jump = 0;
        int end = 0;
        int curr = 0;

        for(int i = 0;i<n-1;i++){
            curr = Math.max(curr,i + nums[i]);

            if(i == end){
                jump++;
                end = curr;
            }
        }   
        return jump;
    }
}