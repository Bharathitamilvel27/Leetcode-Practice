class Solution {
    public int hammingWeight(int n) {
        //optimal solution
        int no_of_1_cnt=0;
        while(n!=0){
            n = n&(n-1); //eg:n= 11 , 11&10->n=10 , 10&9->n=8, 8&7->n=0 , cnt=3;
            no_of_1_cnt++;
        }
        return no_of_1_cnt;
    }
}