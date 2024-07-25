import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  1st String: ");
        String str1=scanner.next();
        System.out.println("Enter the 2nd String: ");
        String str2=scanner.next();
        if(str1.length()<=str2.length()) System.out.println(checkSubstring(str1,str2));
        else System.out.println(checkSubstring(str2,str1));
    }
    public static boolean checkSubstring(String smaller, String larger){
        int i=0,j=0;
        while(i<smaller.length() && j<larger.length()){
            if(smaller.charAt(i)==larger.charAt(j))i++;
            j++;
        }
        return i==smaller.length();
    }
}