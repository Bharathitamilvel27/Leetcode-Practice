class Solution {
    public boolean ispalindrome(String s){
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String max="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub = s.substring(i,j+1);
                if(ispalindrome(sub)){
                    if(sub.length()>max.length())
                    max=sub;
                }
            }
        }
        return max;
    }
}