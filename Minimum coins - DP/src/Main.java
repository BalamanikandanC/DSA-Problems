import java.util.Arrays;
import java.util.Scanner;

/**
 Consider a money system consisting of n coins. Each coin has a positive integer value. Your task is to produce a sum of money x using the available coins in such a way that the number of coins is minimal.
 For example, if the coins are {1,5,7} and the desired sum is 11, an optimal solution is 5+5+1 which requires 3 coins.
 Input
 The first input line has two integers n and x: the number of coins and the desired sum of money.
 The second line has n distinct integers c1,c2,....,cn: the value of each coin.
 Output
 Print one integer: the minimum number of coins. If it is not possible to produce the desired sum, print -1.
 Constraints

 1 <= n <= 100
 1 <= x <= 10^6
 1 <= ci <= 10^6

 Example
 Input:
 3 11
 1 5 7

 Output:
 3
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of coins and sum to make: ");
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] coins= new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the value of "+ (i+1) +"th coin: ");
            coins[i]=sc.nextInt();
        }
        int[] dp= new int[x+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=x;i++){
            for(int c: coins){
                if(i>=c && dp[i-c]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],dp[i-c]+1);
                }
            }
        }
        System.out.println("minimum coins required to make sum "+x+" is: "+dp[x]);
    }
}