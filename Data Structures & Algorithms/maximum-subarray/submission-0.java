class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sum =0;
        int maxi =nums[0];
        for(int i=0;i<n;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            maxi = Math.max(sum,maxi);
        }
        return maxi;
    }
}
