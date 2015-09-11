
package assignment3loops;

import java.util.Scanner; //needed for scanner 

/**Programmer: Samantha Shurie
 * CPT 163-27: Java I
 * Date: 9/10/15
 * Email: shuries@my.wccc.edu
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
        
        //validate entry
        while(word.length() < 5) {
            System.out.print("*Please enter a word that is 5 characters or longer: ");
            word = keyboard.nextLine();
        }
            
        //loop word
        /*start at (length - 1(last character)), and stop at 0,
        /*decrementing by 1. Store character in this position in a variable
        /*add those variables together by looping*/
        for(int i = (word.length() - 1); i > -1;i--) {
            letter = word.charAt(i);
            reverseWord = reverseWord + letter;
        }
        //output word :)
        System.out.print("Your word backwards---> " + reverseWord);
        
    }
    
}
