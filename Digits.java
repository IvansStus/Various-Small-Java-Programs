/**
 *  Program #1b
 *  Method use for Digits Program. Return first Digit, last Digit, and length. 
 *  CS108-2
 *  1/26/18
 *  @author Ivan Stus
*/
import java.util.Scanner;
public class Digits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); //scans for number
		Digits d = new Digits(); //creates instance
		d.firstDigit(n); //method calls
		d.lastDigit(n);
		d.digits(n);
	}
	public int firstDigit(int n) { //finds first digit
		String digitFirst = Integer.toString(n);
		if (digitFirst.length() == 10) {
			digitFirst = digitFirst.substring(1,9);
		}
		return Character.getNumericValue(digitFirst.charAt(0));
		
	}
	public int lastDigit(int n) { //finds last digit
		String digitLast = Integer.toString(n);
		return Character.getNumericValue(digitLast.charAt(digitLast.length() - 1));
	}
	public int digits(int n) { //finds string length
		String digitLength = Integer.toString(n);
		if (digitLength.length() == 10) {			
			return Character.getNumericValue('9');
		}
		return digitLength.length();
	}
}
