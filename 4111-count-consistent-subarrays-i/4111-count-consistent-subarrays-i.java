class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int andValue = nums[i];
            int minValue = nums[i];

            for (int j = i; j < n; j++) {

                andValue = andValue & nums[j];
                minValue = Math.min(minValue, nums[j]);

                if (andValue == minValue) {
                    count++;
                }
            }
        }

        return count;
    }
}