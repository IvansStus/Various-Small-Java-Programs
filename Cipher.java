/**
 *  Program #3b
 *  Cipher puzzle
 *  CS108-2
 *  2/21/18
 *  @author Ivan Stus
*/
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class Cipher {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);		
		String fileName = scan.nextLine(); //FileName to open		
		String key = scan.nextLine(); //Keyword scanned
		int decider = scan.nextInt();  //Decides to encrypt or decrypt
		if (decider < 1 || decider > 2) { //Decider must be 1-2
			System.out.println("Usage: Cipher fileToCipher cipherKey 1forEncode/2forDecode");
		}
		if (key.length() < 3) { //Key must be >= 3
			System.out.println("Usage: Cipher fileToCipher cipherKey 1forEncode/2forDecode");
			return;
		}
		try {		
		File file = new File(fileName);	        
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(fileName);
        while (input.hasNextLine()) {
        	String message = input.nextLine();        	
        	if (decider == 1) { //encrypting(shiftUp)        		        		     		
        		for (int i = 0, j = 0; i < message.length(); i++, j++) {
        			if (j == key.length()) {
        				j = 0;
        			}
            		char c = message.charAt(i);
            		int distance = key.charAt(j) - 'a';            		
        			output.print(shiftUpByK(c, distance));        			
            	}
        	}
        	else if (decider == 2) { //decrypting(shiftDown)        		
        		for (int i = 0, j = 0; i < message.length(); i++, j++) {
        			if (j == key.length()) {
        				j = 0;
        			}
            		char c = message.charAt(i);
            		int distance = key.charAt(j) - 'a';            		
        			output.print(shiftDownByK(c, distance));        			
            	}
        	}
        }        
		}		
		catch (Exception e) { //catches IOExceptions
			System.out.println("Usage: Cipher fileToCipher cipherKey 1forEncode/2forDecode");
		}		
	}
	public static final int NUM_LETTERS = 26;	
	public static char shiftUpByK(char c, int distance) { //Encoding
        if ('a' <= c && c <= 'z')
            return (char) ('a' + (c - 'a' + distance) % NUM_LETTERS);
        if ('A' <= c && c <= 'Z')
            return (char) ('A' + (c - 'A' + distance) % NUM_LETTERS);
        return c; 
    }
	public static char shiftDownByK(char c, int distance) { //Decoding
        return shiftUpByK(c, NUM_LETTERS - distance);
    }
}
