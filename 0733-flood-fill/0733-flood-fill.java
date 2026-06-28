class Solution {
    public void dfs(int[][] image,int sr,int sc,int oldcolor,int newcolor){
        int rows=image.length;
        int cols=image[0].length;
        if(sr<0 || sc<0 || sr>=rows || sc>=cols || image[sr][sc]!=oldcolor) {
            return;
        }
        image[sr][sc]=newcolor;

        dfs(image,sr-1,sc,oldcolor,newcolor);
        dfs(image,sr+1,sc,oldcolor,newcolor);
        dfs(image,sr,sc-1,oldcolor,newcolor);
        dfs(image,sr,sc+1,oldcolor,newcolor);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldcolor=image[sr][sc];
        if(oldcolor==color ){
            return image;// color=newcolor
        }
        dfs(image,sr,sc,oldcolor,color);
        return image;
    }
}