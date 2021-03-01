/**
 *  Program #1c
 *  Organize Countries by rows and columns and keep count of how many medals they get.  
 *  CS108-2
 *  1/30/18
 *  @author Ivan Stus
*/
public class MedalTally {
	public static void main(String[] args) {			
		String[] countryNames = new String[] {"Canada", "Italy", "Germany", "Japan", "Kazakhstan", "Russia", "South Korea", "United States"};
		int[][] medalCounts = new int[][] {
			//{1,1,1}, {1,0},{1}
			{0, 3, 0},
			{0, 0, 1},
			{0, 0, 1},
			{1, 0, 0},
			{0, 0, 1},
			{3, 1, 1},
			{0, 1, 0},
			{1, 0 ,1},
		};
		printHeader();
		printMedalCount(countryNames, medalCounts);
		getTotalCount(medalCounts);				
	}
	public static void printHeader() {
		System.out.printf("%15s", "Country");
		System.out.printf("%8s", "Gold");
		System.out.printf("%8s", "Silver");
		System.out.printf("%8s", "Bronze");
		System.out.printf("%8s", "Total");
		System.out.println();
	}
	public static void printMedalCount(String[] countryNames, int[][] medalCounts) {				
		int sum = 0;
		for (int i = 0; i < countryNames.length; i++) {											
			System.out.printf("%15s", countryNames[i]);
			for (int j = 0; j < medalCounts[i].length; j++) {				
				System.out.printf("%8s", medalCounts[i][j]);
				sum = sum + medalCounts[i][j];				
			}
			System.out.printf("%8s", sum);
			sum = 0;
			System.out.println();
		}
	}
	public static int getTotalCount(int[][] medalCounts) {
		int total = 0;
		for (int i = 0; i < medalCounts.length; i++) {
			for (int j = 0; j < medalCounts[i].length; j++) {
				total = total + medalCounts[i][j];				
			}			
		}
		System.out.println("Total medal count is " + total);
		return total;		
	}
}