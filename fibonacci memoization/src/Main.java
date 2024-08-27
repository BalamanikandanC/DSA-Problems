import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c;
        do{
            System.out.println("Fibonacci nth term finder:");
            System.out.println("Enter the number: ");
            int n= sc.nextInt();
            int []memo=new int[n+1];
            System.out.println(fib(n,memo));
            System.out.println("want to continue(y/n): ");
            c=sc.next().charAt(0);
        }while(c=='y');
    }

    public static int fib(int n,int []memo){
        if(n<0){
            throw new IllegalArgumentException("Index was negative, No such thing as a negative index in series.");
        }
        if(n<=1)return n;
        if(memo[n]!=0)return memo[n];
        else{
           memo[n]=fib(n-1,memo)+fib(n-2,memo);
        }
        return memo[n];
    }
}