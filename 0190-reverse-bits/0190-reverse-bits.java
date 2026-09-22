class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            int last_bit = n & 1; // to get the last bit if it is 0 ans = 0, if 1 ans = 1
            result = (result<<1) | last_bit; // adding my last bit to result  why <<1? moving the other bits to put my last bit at the end
            n = n>>1; // moving the next bit at the end m eg: 1011, if 1 done next the 1 should come to the end to process it

        }
        return result;
    }
}