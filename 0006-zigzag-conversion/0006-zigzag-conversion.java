class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] rows = new StringBuilder[numRows]; //collection/array of all the rows
        for(int i=0;i<numRows;i++){
            rows[i] = new StringBuilder(); //creating stringBuilder for each row
        }
        int curr_row=0;
        int nextdirection_upordown=1; // 1 because always at starting it goes down, why 1 incrementing to next row by adding 1 (downward), why -1 - to previous row(upward)
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            rows[curr_row].append(ch);
            if(curr_row==0){
                nextdirection_upordown=1;
            }
            if(curr_row==numRows-1){
                nextdirection_upordown=-1;
            }

            curr_row=curr_row+nextdirection_upordown; //decided up or down eg: curr_row =1, by adding 1 , 2 moves to 2nd row
        }

            StringBuilder ans = new StringBuilder();
            for(int i=0;i<numRows;i++){
                ans.append(rows[i]);
            }
    return ans.toString();
    }
}