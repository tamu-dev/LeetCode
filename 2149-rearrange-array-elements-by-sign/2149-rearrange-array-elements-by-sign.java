class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int value : nums){
            if(value < 0){
                ans[neg] = value;
                neg +=2;
            }else{
                ans[pos] = value;
                pos += 2;
            }
        }
        return ans;
    }
}