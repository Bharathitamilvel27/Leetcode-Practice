class Solution {
    public int majorityElement(int[] nums) {
        int target = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<>(); // stores the value and it's cnt
        for(int i =0;i<nums.length;i++){
           int cnt = map.getOrDefault(nums[i],0)+1;
           map.put(nums[i],cnt);
           if(cnt>target) return nums[i];
        }
        return -1;
    }
}