
package assignment3loops;

import java.util.Scanner; //needed for scanner 

/**
 *
 * @author Samantha Shurie
 */
public class Assignment3Loops {

    public static void main(String[] args) {
        //declare variables
        Scanner keyboard = new Scanner(System.in);
        String word;
        String reverseWord = "";
        char letter;
        
        //accept input
        System.out.print("Enter a word to reverse: ");
        word = keyboard.nextLine();
        
        //loop word
        /*start at (length - 1(last character)), and stop at 0,
        /*decrementing by 1. Store character in this position in a variable
        /*add those variables together by looping*/
        for(int i = (word.length() - 1); i > -1;i--) {
            letter = word.charAt(i);
            reverseWord = reverseWord + letter;
        }
        //output word :)
        System.out.print("Your word backward---> "
                        + reverseWord);
        
    }
    
}
