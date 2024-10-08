/*Dice Combinations

Time limit: 1.00 s
Memory limit: 512 MB

Your task is to count the number of ways to construct sum n by throwing a dice one or more times. Each throw produces an outcome between 1 and  6.
For example, if n=3, there are 4 ways:

1+1+1
1+2
2+1
3

Input
The only input line has an integer n.
Output
Print the number of ways modulo 10^9+7.

Constraints
1 <= n <= 10^6

Example
Input:
3

Output:
4
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int[]dp=new int[n+1];
        int MOD=1000000007;
        dp[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=6;j++){
                if(i>=j){
                    dp[i]=(dp[i]+dp[i-j])%MOD;
                }
            }
        }
        System.out.println("total no. of combinations: "+dp[n]);
    }
}