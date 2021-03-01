/**
 *  Program #2a
 *  Use recursive methods to execute the Fibonacci sequence.
 *  CS108-2
 *  2/5/18
 *  @author Ivan Stus
*/
public class Fibonacci {

	public static void main(String[] args) {		
		int n;
		int algorithmType;		
	}
	public static int iFib(int n) { //Iteration method
		int x = 0; //initial values
		int y = 1; 
		int z = 1;
		if (n <= 1) { //return n
			return n;
		}
		for (int i = 0; i < n; i++) { //loops thru sequence if n <= 1
			x = y;
			y = z;
	        z = x + y; //Finds next value of sequence
		}		
		return x; //return final value of addition of nth term sequence
	}
	public static int rFib(int n) { //Recursive method
		if (n <= 1) { //return n
            return n;
        }
        return rFib(n - 1) + rFib(n - 2); //return the sum and loop back until n <= 1
	}
	public static long getTime(int algorithmType, int n) { //Finds time of methods
		long startTime = System.nanoTime();
		if (algorithmType == 1) { //Iteration
			iFib(n);
		}
		if (algorithmType == 2) { //Recursive
			rFib(n);
		}		
		long endTime = System.nanoTime();
		return endTime - startTime; //Final time returned		
	}
	public String getIdentificationString() {
		return ("Program 2, Ivan Stus, csscxxxx");
	}

}
