class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int fix=0;fix<n-2;fix++){
            if(fix>0 && nums[fix]==nums[fix-1]) continue;
            int left = fix+1;
            int right = n-1;
            while(left < right){
                int sum = nums[fix] + nums[left] + nums[right];
                if(sum < 0) left++;
                else if (sum > 0)   right--;
                else{
                    ans.add(Arrays.asList(
                        nums[fix],
                        nums[left],
                        nums[right]
                    ));
                    left++;
                    right--;
                    while(left<right && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right] == nums[right+1])  right--;
                }
            }
        }
        return ans;
    }
}