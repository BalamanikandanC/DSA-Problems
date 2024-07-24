
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str=scanner.next();
        int result=0;
        for(int i=str.length()-1,power=0;i>=0;i--){
            result+=pow(26,power++)*(str.charAt(i)-'A'+1);
        }
        System.out.println(result);
    }
    public static int pow(int base,int exponent){
        if(exponent==0)return 1;
        int powerValue=1;
        while(exponent!=0){
            powerValue*=base;
            exponent--;
        }
        return powerValue;
    }
}