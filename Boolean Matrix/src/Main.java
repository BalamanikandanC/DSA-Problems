import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int rowSize=scanner.nextInt();
        System.out.println("Enter the col size: ");
        int colSize=scanner.nextInt();
        int [][] arr=new int [rowSize][colSize];
        System.out.println("Enter the values: ");
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                if(arr[i][j]==1){
                    if(i-1>-1)arr[i-1][j]=0;
                    if(j-1>-1)arr[i][j-1]=0;
                    if(i+1<rowSize)arr[i+1][j]=0;
                    if(j+1<colSize)arr[i][j+1]=0;
                }
            }
        }
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Hello world!");
    }
}