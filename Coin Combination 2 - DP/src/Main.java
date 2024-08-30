//        Consider a money system consisting of n coins. Each coin has a positive integer value. Your task is to calculate the number of distinct ordered ways you can produce a money sum x using the available coins.
//        For example, if the coins are {2,3,5} and the desired sum is 9, there are 3 ways:
//
//        2+2+5
//        3+3+3
//        2+2+2+3
//
//        Input
//        The first input line has two integers n and x: the number of coins and the desired sum of money.
//        The second line has n distinct integers c_1,c_2,....,c_n: the value of each coin.
//        Output
//        Print one integer: the number of ways modulo 10^9+7.
//        Constraints
//
//        1 <= n \<= 100
//        1 <= x <= 10^6
//        1 <= c_i <= 10^6
//
//        Example
//        Input:
//        3 9
//        2 3 5
//
//        Output:
//        3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of coins: ");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" coins value: ");
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        System.out.println("Enter the amount: ");
        int x = sc.nextInt();
        int[] dp = new int[x+1];
        dp[0]=1;
        for(int c: coins){
            for(int i=1;i<=x;i++){
                if (i>=c && dp[i-c]!=0) {
                    dp[i]=dp[i]+dp[i-c];
                }
            }
        }
        System.out.println("total coin combination of distinct order is: "+dp[x]);
    }
}