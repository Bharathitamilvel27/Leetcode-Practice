class Solution {
    public int removeDuplicates(int[] nums) {
        int k=2;  //bcz an element can appear 1 or 2 times not more than 2 , if it appears -> duplicate
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){ // it checks whether current element is same as the element which is at 2 step before it
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}