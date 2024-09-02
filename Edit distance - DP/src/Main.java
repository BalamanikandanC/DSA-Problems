//The edit distance between two strings is the minimum number of operations required to transform one string into the other.
//        The allowed operations are:
//
//        Add one character to the string.
//        Remove one character from the string.
//        Replace one character in the string.
//
//        For example, the edit distance between LOVE and MOVIE is 2, because you can first replace L with M, and then add I.
//        Your task is to calculate the edit distance between two strings.
//        Input
//        The first input line has a string that contains n characters between A–Z.
//        The second input line has a string that contains m characters between A–Z.
//        Output
//        Print one integer: the edit distance between the strings.
//        Constraints
//
//        1 <= n,m <= 5000
//
//        Example
//        Input:
//        LOVE
//        MOVIE
//
//        Output:
//        2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Enter the first and second String: ");
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            int n = s1.length();
            int m = s2.length();
            int[][] dp = new int[n+1][m+1];
            for(int j=0;j<=m;j++){
                dp[0][j] = j;
            }
            for(int i=0;i<=n;i++){
                dp[i][0] = i;
            }
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=m; j++) {
                    if (s1.charAt(i-1) == s2.charAt(j-1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        int a=dp[i-1][j]+1;
                        int b=dp[i][j-1]+1;
                        int c=dp[i-1][j-1]+1;
                        if(a<b){
                            dp[i][j] = Math.min(a, c);
                        } else{ dp[i][j] = Math.min(b, c);}
                    }
                }
            }

            System.out.println("minimum operations required to change s1 to s2 is: "+dp[n][m]);
        }
    }
}