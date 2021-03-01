/**
 *  Program #8
 *  Enter 2 kinds of food and 3 cities, 
 *  program finds out how many restaurants include 
 *  the kind of food in the business name 
 *  (basic application +5 points)
 *  CS108-2
 *  4/30/18
 *  @author Ivan Stus
*/
import java.util.List;
import java.util.Scanner;
import realtimeweb.simplebusiness.SimpleBusiness;
import realtimeweb.simplebusiness.domain.Business;

public class Eateries {
	
	public static void main(String[] args) {	
		SimpleBusiness yelp = getData(); //Sets variable yelp to the data retrieved from yelp
		System.out.println("Enter 2 food types:");
		String[] kinds = getDataInfoKinds(); //Assigns user input into kinds array
		System.out.println("Enter 3 cities in the format (City, STATE):");
		String[] cities = getDataInfoCities(); //Assigns user input into cities array		
		printData(yelp, kinds, cities); //Prints data			
	}
	/**
	 * Gets data from yelp
	 * @return
	 */
	public static SimpleBusiness getData() {
		SimpleBusiness yelp = new SimpleBusiness();
		return yelp;		
	}
	/**
	 * Assigns user input
	 * @return String[] kinds
	 */
	public static String[] getDataInfoKinds() {		
		Scanner scan = new Scanner(System.in);
		String[] kinds = new String[2];
		for (int i = 0; i < kinds.length; i++) {
			kinds[i] = scan.nextLine();			
		}
		return kinds;		
	}
	/**
	 * Assigns user input
	 * @return String[] cities
	 */
	public static String[] getDataInfoCities() {
		Scanner scan = new Scanner(System.in);
		String[] cities = new String[3];
		for (int i = 0; i < cities.length; i++) {
			cities[i] = scan.nextLine();
		}
		return cities;		
	}
	/**
	 * Prints out information
	 * @param yelp
	 * @param kinds
	 * @param cities
	 */
	public static void printData(SimpleBusiness yelp, String[] kinds, String[] cities) {		
		for (String city: cities ) { //Loops thru every city and kind			
			for (String kind: kinds) {				
			List<Business> businesses = yelp.search(kind,  city);
				int count = 0;
				for (Business b: businesses) {					
					String name = b.getName();
					if (name.toLowerCase().contains(kind.toLowerCase())) { //Makes everything lowercase for checking purposes
						count++; //increase count everytime there's a match
					}
				}		
				System.out.println(city + ": " + count + " " + kind + " restaurants use \"" + kind + "\" in their business name." );
				count = 0; //resets count after loop is done executing
			}
		}			
	}
}
