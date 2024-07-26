
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character,String>dialPadMap=new HashMap<>();
        dialPadMap.put('2',"abc");
        dialPadMap.put('3',"def");
        dialPadMap.put('4',"ghi");
        dialPadMap.put('5',"jkl");
        dialPadMap.put('6',"mno");
        dialPadMap.put('7',"pqrs");
        dialPadMap.put('8',"tuv");
        dialPadMap.put('9',"xywz");

        String input;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string: ");
        input=scanner.next();

        ArrayList<String> combinations=new ArrayList<>();
        if(input.length()==0) System.out.println(combinations);
        else {
            solve(0, input, "", combinations, dialPadMap);
            System.out.println(combinations);
        }
    }
    private static void solve(int i,String input,String str,ArrayList<String>Combinations,Map<Character,String>dialPadMap){

        if(i==input.length()){
            Combinations.add(str);
            return;
        }
        for(char c:dialPadMap.get(input.charAt(i)).toCharArray()){
            String temp=str;
            temp+=c;
            solve(i+1,input,temp,Combinations,dialPadMap);
        }
    }
}