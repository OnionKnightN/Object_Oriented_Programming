// Has a package named worksheet02.
package worksheet02;
// Imported java.util.Random to use Random Class.
import java.util.Random;

public class RandomUppercaseLetter {
	public static void main(String args[]){
		// Created a Char Array with letters of the Alphabet(all uppercase)
		char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		// Created Random Class called rand.
		Random rand = new Random();
		// Created an integer i that gives a random number based on the length of the array alphabet.
		int i = rand.nextInt(alphabet.length);
		// Prints out a random upper case letter from the alphabet.
		System.out.print("Random uppercase letter: " + alphabet[i]);
	}
}
