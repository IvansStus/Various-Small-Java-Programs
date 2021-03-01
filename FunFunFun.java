/**
 *  Program #2b
 *  Recursive method practice
 *  CS108-2
 *  2/12/18
 *  @author Ivan Stus
*/
public class FunFunFun {

	public static void main(String[] args) {		
		FunFunFun app = new FunFunFun();
		System.out.println(app.fastCountDown(3));
		app.gcd(1440,408,0);
		System.out.println("            return " + 24);
		System.out.println("         return " + 24);
		System.out.println("      return " + 24);
		System.out.println("   return " + 24);
	    System.out.println("T(4) = " + app.eTime(4));
	}
	public String fastCountDown(int n) {
		String countDown = "";
		 if (n < 0) { //No negatives
			 System.out.println("ERROR");
		 }
		 else {
			 if (n == 0) { //base case #1
				 countDown += n + " ";
			 }
			 if (n == 1) { //base case #2
				 countDown += n + " ";
			 }
			 else { //recursive call
				 countDown = n + " " + fastCountDown(n-2);
				 
			 }
		 }
		 return countDown; //return string
	}
	public int gcd(int a, int b, int c) {
		int temp = 0;
		String spaces = "   ";
		if (b == 0) { //base case			
			System.out.println("gcd(" + a + "," + b + ")");
			for (int i = c; i >= 0; i--) {
				System.out.print(spaces);				
			}
			c--;
			System.out.println("return " + a);
			return a;
		}
		else { //for every other situation
			System.out.println("gcd(" + a + "," + b + ")");			
			c++;		
			for (int i = 0; i < c; i++) {
				System.out.print(spaces);
			}
			if (b > a) { //swap values if b > a
				temp = a;
				a = b;
				b = temp;
				System.out.println("gcd(" + a + "," + b + ")");			
				c++;		
				for (int i = 0; i < c; i++) { //prints amount of spaces
					System.out.print(spaces);
				}
			}
			return gcd(b,a%b,c);			
		}		
	}
	public int eTime(int n) {
		return (int) (Math.pow(2, n) - 1); //satisfies the equation (2^n - 1)
	}
	public String getIdentificationString() {
		return ("Program 2b, Ivan Stus");
	}

}
