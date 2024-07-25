import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word,guess,result="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
        word=scanner.next();
        System.out.println("Enter the guess: ");
        guess=scanner.next();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            map.put(word.charAt(i),i);
        }
        for(int j=0;j<guess.length();j++){
            if(map.getOrDefault(guess.charAt(j),-1)==j){
                result+="g";
            }
            else if(map.getOrDefault(guess.charAt(j),-1)==-1){
                result+="-";
            }
            else result+="y";
        }
        System.out.println(result);
    }
}