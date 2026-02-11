class Solution {
    public int removeElement(int[] nums, int val) {
        int current_index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[current_index]=nums[i];
                current_index++;
            }
        }
        return current_index;
    }
}
//current_index is tracks the position where the element has to be inserted if it is not euals to the given value
// why we are returning the index position? they have asked us to retutn the position too, whwre the last element is stored, last index has the count in the curr array