class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result_list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue; //skip duplicates

            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0) {
                    result_list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r && nums[l]==nums[l+1]) l++; //to skip duplicate left values
                    while(l<r && nums[r]==nums[r-1]) r--; //skip duplicate right values

                    l++;
                    r--; // moving l and r pointers after skipping the duplicates
                }
                else if(sum<0) l++;
                else r--;
            }
        }

        return result_list;
    }
}