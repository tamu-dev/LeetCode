class Solution {
    public void swap(int [] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
    public void reverse(int[] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = n-2;
        while(pivot >=0 && nums[pivot] >= nums[pivot+1]){
            pivot--;
        }
        if(pivot < 0){
            reverse(nums,0,n-1);
            return;
        }
        int arg = n-1;
        while(nums[arg] <= nums[pivot]) arg--;
        swap(nums,pivot,arg);
        reverse(nums,pivot+1,n-1);
    }
}