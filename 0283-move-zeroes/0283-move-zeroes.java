class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        List <Integer> arr = new ArrayList<>();
        int zeroCnt = 0;

        for(int i=0; i<n; i++){
            if(nums[i] == 0)    zeroCnt++;
            else arr.add(nums[i]);
        }
        int i=0;
        for(int num : arr){
            nums[i++] = num;
        }
        while(zeroCnt > 0){
            nums[i++] = 0;
            zeroCnt--;
        }
    }
}