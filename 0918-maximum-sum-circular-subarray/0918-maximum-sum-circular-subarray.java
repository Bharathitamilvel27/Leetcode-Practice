class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum=nums[0];
        int kadanes_max=nums[0];
        int final_max=nums[0];
        int min_sum=nums[0];
        int kadanes_min=nums[0];
        int t=nums[0]; // bcz we are starting the loop from 1 , so t+num[i] skips 1st element
        for(int i=1;i<nums.length;i++){
            t+=nums[i];
            sum = Math.max(nums[i],sum+nums[i]);
            kadanes_max = Math.max(sum,kadanes_max);

            min_sum=Math.min(nums[i],min_sum+nums[i]);
            kadanes_min = Math.min(min_sum,kadanes_min);

        }
        if(kadanes_max<0) return kadanes_max;
        final_max = Math.max(kadanes_max,t-kadanes_min);
        return final_max;
    }
}