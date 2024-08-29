import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i]=dp[i>>1]+(i&1);// (or) dp[i]=dp[i&(i-1)]+1;
        }
        for(int x: dp) System.out.print(x+" ");
    }
}