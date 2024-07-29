import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size= scanner.nextInt();
        int [] arr=new int[size];
        System.out.println("Enter the array values: ");
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("Equlibrium Index is: ");
        int totalSum=0,leftSum=0;
        for(int n: arr)totalSum+=n;
        for(int i=0;i<size;i++){
            totalSum-=arr[i];//right sum;
            if(totalSum==leftSum){
                System.out.print(i+1);// i+1 for 1 based indexing
                break;
            }
            leftSum+=arr[i];
        }
        if(totalSum==0) System.out.print(-1);

    }
}