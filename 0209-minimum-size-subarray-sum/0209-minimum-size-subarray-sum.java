class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min_len = Integer.MAX_VALUE;
        int sum=0;
        int left =0;
        for(int right=0;right<nums.length;right++){
            sum = sum+nums[right];
            while(sum>=target){
                min_len = Math.min(min_len, right-left+1);
                sum = sum - nums[left];
                left++;
            }
        }
       if(min_len == Integer.MAX_VALUE) return 0;
        return min_len;
    }
}