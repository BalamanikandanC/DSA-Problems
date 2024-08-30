import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
            int temp=i;
            while (temp != 0) {
                int d = temp % 10;
                temp=temp/10;
                if (d > 0 && dp[i - d] != Integer.MAX_VALUE) {
                dp[i] = Math.min(dp[i], dp[i - d] + 1);
                }
            }
        }
        System.out.println("Total no. of steps to remove digits is: "+dp[n]);
    }
}