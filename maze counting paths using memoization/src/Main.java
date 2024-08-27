public class Main {
    public static void main(String[] args) {
        int [][]maze= new int[][]{
                {1,1,0,1,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {1,1,1,1,1}
        };
        int [][]memo= new int[maze.length][maze[0].length];

        int paths=countingPaths1(maze,0,0);
        long preTime=System.currentTimeMillis();
        System.out.println("total number of paths in maze without using memoization: "+paths);
        long postTime=System.currentTimeMillis();
        System.out.println("time taken to solve maze without using memoization: "+ (postTime-preTime));

        paths=countingPaths2(maze,0,0,memo);
        preTime=System.currentTimeMillis();
        System.out.println("total number of paths in maze using memoization: "+paths);
        postTime=System.currentTimeMillis();
        System.out.println("time taken to solve maze using memoization: "+ (postTime-preTime));

        paths=countingPaths3(maze);
        preTime=System.currentTimeMillis();
        System.out.println("total number of paths in maze using tabulation: "+paths);
        postTime=System.currentTimeMillis();
        System.out.println("time taken to solve maze using tabulation: "+ (postTime-preTime));

    }

    public static int countingPaths1(int[][] maze, int i, int j){
        int n=maze.length;
        int m=maze[0].length;

        // is not valid square/cell i.e,: check for out of bounds and blocked cell
        if(i>=n || j>=m || maze[i][j]==0)return 0;

        // is reached end
        if(i==n-1 && j==m-1)return 1;

        return countingPaths1(maze,i,j+1)+countingPaths1(maze,i+1,j);
    }
    public static int countingPaths2(int[][] maze, int i, int j, int [][] memo){
        int n=maze.length;
        int m=maze[0].length;

        // is not valid square/cell i.e,: check for out of bounds and blocked cell
        if(i>=n || j>=m || maze[i][j]==0)return 0;

        // is reached end
        if(i==n-1 && j==m-1)return 1;

        //is cell already processed
        if(memo[i][j]!=0) return memo[i][j];

        memo[i][j]= countingPaths2(maze,i,j+1,memo)+countingPaths2(maze,i+1,j,memo);

        return memo[i][j];
    }

    public static int countingPaths3(int[][] maze){
        int n=maze.length;
        int m=maze[0].length;

        int[][]dp=new int[n][m];

        //Initialize the starting point
        dp[0][0]=1;

        //filling first row
        for(int i=1;i<m;i++){
            if(maze[0][i]==1){
                dp[0][i]=dp[0][i-1];
            }
        }

        //filling first col
        for(int j=1;j<n;j++){
            if(maze[j][0]==1){
                dp[j][0]=dp[j-1][0];
            }
        }

        // filling rest of dp table
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(maze[i][j]==1){
                    dp[i][j]=dp[i][j-1]+dp[i-1][j];
                }
            }
        }

        // The answer is the number of paths to the bottom-right corner
        return dp[n-1][m-1];
    }

}