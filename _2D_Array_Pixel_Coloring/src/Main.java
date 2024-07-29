import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter the row size: ");
//        int row=scanner.nextInt();
//        System.out.println("Enter the col size: ");
//        int col=scanner.nextInt();
//        int[][] arr = new int[row][col];
//        System.out.println("Enter the array values: ");
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                arr[i][j]=scanner.nextInt();
//            }
//        }
        int[][] arr = new int[][]{
                {1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        int r, c;
        System.out.println("Enter the pixel location (row and col) value: ");
        r=scanner.nextInt();
        c=scanner.nextInt();
        System.out.println("Enter the color value: ");
        int color=scanner.nextInt();
        boolean[][] visited= new boolean[arr.length][arr[0].length];
        dfs(arr,visited,r,c,arr[r][c]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(visited[i][j])arr[i][j]=color;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void dfs(int[][] arr, boolean[][] visited, int rowValue, int colValue, int curColor){
        int[] adjacentRows = new int[]{-1,-1,-1,0,0,1,1,1};
        int[] adjacentCols = new int[]{-1,0,1,-1,1,-1,0,1};
        System.out.println(rowValue+","+colValue+","+curColor);
        visited[rowValue][colValue]=true;
        for(int i=0;i<8;i++){
            if(isSafe(arr,visited,rowValue+adjacentRows[i],colValue+adjacentCols[i],curColor))
                dfs(arr,visited,rowValue+adjacentRows[i],colValue+adjacentCols[i],curColor);
        }
    }

    public static boolean isSafe(int[][] arr,boolean[][] visited,int row, int col, int curColor){
        return row>=0 && row<arr.length && col>=0 && col<arr[0].length && arr[row][col]==curColor && !visited[row][col];
    }
}