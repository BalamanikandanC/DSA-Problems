//        You are in a bookshop which sells n different books. You know the price and number of pages of each book.
//        You have decided that the total price of your purchases will be at most x. What is the maximum number of pages you can buy? You can buy each book at most once.
//        Input
//        The first input line contains two integers n and x: the number of books and the maximum total price.
//        The next line contains n integers h_1,h_2,...,h_n: the price of each book.
//        The last line contains n integers s_1,s_2,...,s_n: the number of pages of each book.
//        Output
//        Print one integer: the maximum number of pages.
//        Constraints
//
//        1 <= n <= 1000
//        1 <= x <= 10^5
//        1 <= h_i, s_i <= 1000
//
//        Example
//        Input:
//        4 10
//        4 8 5 3
//        5 12 8 1
//
//        Output:
//        13
//
//        Explanation: You can buy books 1 and 3. Their price is 4+5=9 and the number of pages is 5+8=13.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Books: ");
        int n = sc.nextInt();
        System.out.println("Enter purchase amount: ");
        int x = sc.nextInt();
        int[] page = new int[n];
        int[] price = new int[n];
        System.out.println("Enter the price of "+n+" books: ");
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println("Enter the no. of pages for "+n+" books: ");
        for (int i = 0; i < n; i++) {
            page[i] = sc.nextInt();
        }
        int[] dp=new int[x+1];
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=price[j] && price[j]!= i-price[j]) {
                    dp[i] = Math.max(dp[i], page[j] + dp[i - price[j]]);
                }
            }
        }
        System.out.println("Maximum pages can be purchased is: "+ dp[x]);
    }
}