class Solution {
    public int peak(int [] nums){
        int n = nums.length;
        int peakSum = 0;
        for(int i=1;i<n-1;i++){
            if(nums[i] > nums[i+1] && nums[i] > nums[i-1])  peakSum += nums[i];
        }
        return peakSum;
    }
    public int valley(int [] nums){
        int n = nums.length;
        int valleySum = 0;
        for(int i=1;i<n-1;i++){
            if(nums[i] < nums[i+1] && nums[i] < nums[i-1])  valleySum += nums[i];
        }
        return valleySum;
    }
    public int peakValleyDifference(int[] nums) {
        int peakSum = peak(nums);
        int valleySum = valley(nums);
        return peakSum - valleySum;
    }
}