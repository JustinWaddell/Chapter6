package palindrome;
/**
 * class:Palindrome1
 * this program will identify if a word is a palindrome
 */

import java.util.Scanner;
public class Palindrome1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value");
        String pal = input.nextLine();
        //racecar
        int low = 0; //index of a string value
        int high = pal.length() - 1; // last index of a string value
        //create a sentinel variable
        boolean isPalindrome = true;
        while(low < high) {
            if(pal.charAt(low) != pal.charAt(high)){
                //this not a palindrome
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome){
            System.out.println(pal + " is a palindrome");
        }
        else{
            System.out.println(pal + " is not a palindrome");
        }
    }
}
