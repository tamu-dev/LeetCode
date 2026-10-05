class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for(int num : nums){
            if(num == 0)    zeroCount++;
            else if(num == 1)   oneCount++;
            else    twoCount++;

            int index =0;
            for(int i=0; i<zeroCount;i++){
                nums[index] = 0;
                index++;
            }
            for(int i=0;i<oneCount;i++){
                nums[index] = 1;
                index++;
            }
            for(int i=0;i<twoCount;i++){
                nums[index] = 2;
                index++;
            }
        }
    }
}