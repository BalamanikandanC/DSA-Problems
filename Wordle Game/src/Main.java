//         This problem is about the popular word-guessing game Wordle.
//
//        There are two Strings: the secret string hidden and guess string. Each string consists of five uppercase English letters (A-Z).
//
//        When the solver makes a guess, the game announces how good the guess was. This is done using colors. Formally, the colouring works as follows:
//
//        • The letters of the guess that are in correct places are highlighted in green.
//
//        • The letters that are in the secret word but at some other index are highlighted in yellow.
//
//        Unmatched letters are -
//
//        Return a String with the colors assigned to the letters of the given guess. Use 'g' for green, 'y' for yellow, and for letters that did not get any color.
//
//        Input:
//        Word: BLOCK
//        Guess: BRICK
//        Output:g--gg
//
//        Input:
//        Word: BRIDE
//        Guess: SIREN
//        Output:
//        -yyy-

//        Input:
//        Word: SPACE
//        Guess: SIREN
//        Output:g--y-

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hidden word and guess word:(Each length of 5 character string)");
        String hidden=sc.next();
        String guess=sc.next();
        HashMap<Character, Integer> hidden_Letter = new HashMap<>();
        StringBuilder output=new StringBuilder("");
        for(int i=0;i<5;i++){
            if(hidden.charAt(i)==guess.charAt(i))output.append('g');
            else{
                output.append('-');
                hidden_Letter.put(hidden.charAt(i),hidden_Letter.getOrDefault(hidden.charAt(i),0)+1);
            }
        }
        for(int i=0;i<5;i++){
            if(output.charAt(i)=='-'){
                char guessChar=guess.charAt(i);
                if(hidden_Letter.containsKey(guessChar)&& hidden_Letter.get(guessChar)>0){
                    output.setCharAt(i,'y');
                    hidden_Letter.put(guessChar,hidden_Letter.get(guessChar)-1);
                }

            }
        }
        System.out.println(output.toString());
    }
}