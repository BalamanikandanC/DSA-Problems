import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next();
        System.out.println("Balanced Parantheses: "+ checkForBalance(input));
    }
    public static boolean checkForBalance(String input){
        Stack<Character>stack=new Stack<>();
        for(char c:input.toCharArray()){
            if(c=='(' || c=='{' || c=='[') stack.push(c);
            else if(!stack.isEmpty()){
                if(c==')' && stack.pop()!='(')return false;
                else if(c=='}' && stack.pop()!='{')return false;
                else if(c==']' && stack.pop()!='[')return false;

            }
            else return false;
        }
        return stack.isEmpty();
    }
}