class Solution {
    public static void dfs (char[][] grid,int row, int col){
        int rows=grid.length;
        int cols=grid[0].length;
        if(row<0 || col<0 || row>=rows || col>=cols || grid[row][col]=='0'){
            return;
        }
        grid[row][col]='0';
        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
        dfs(grid,row,col-1);
        dfs(grid,row,col+1);
    }

    public int numIslands(char[][] grid) {
        int no_of_island=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                     no_of_island++;
                     dfs(grid,i,j);
                }
            }
        }
        return no_of_island;
    }
}