class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length==0) return 0;
        int slow=0; //1st pointer
        //2nd pointer - fast
        for(int fast=1;fast<length;fast++){
            if(nums[fast]!=nums[slow]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;// to return the count of unique elems, since arr is from 0 but we need count so +1
        //slow has index
    }
}