import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of coins and sum to make: ");
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println("Enter the coin values");
        int[] coins= new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        int[] dp = new int[x+1];
        dp[0]=1;
        for(int i=1; i<=x;i++){
            for(int c: coins){
                if(i>=c && dp[i-c]!=0){
                    dp[i]=dp[i]+dp[i-c];
                }
            }
            System.out.println();
        }
        System.out.println("total number of coin combinations: "+ dp[x]);
    }
}