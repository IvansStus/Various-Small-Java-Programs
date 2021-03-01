/**
 *  Program #4c
 *  Eatery program
 *  CS108-2
 *  3/12/18
 *  @author Ivan Stus
*/
public class Eatery extends Place {
	private double cost;
	private String cuisine;
	private int starRating;
	
	public Eatery (String name, String description, double latitude, double longitude, String cuisine, double cost, int starRating) {
		super(name, description, latitude, longitude);
		this.cost = cost;
		this.cuisine = cuisine;
		this.starRating = starRating;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getRating() {
		return starRating;
	}
	public void setRating(int starRating) {
		this.starRating = starRating;
	}
	public String ratingToStars() {
		if (starRating == 1) {
			return "*";
		}
		if (starRating == 2) {
			return "**";
		}
		if (starRating == 3) {
			return "***";
		}
		if (starRating == 4) {
			return "****";
		}		
		else {
			return "*****";
		}
	}
	public String getCostToSymbols() {
		if (cost < 25) {
			return "$";
		}
		if (cost < 50 && cost > 25) {
			return "$$";
		}
		if (cost < 75 && cost > 50) {
			return "$$$";
		}
		if (cost < 100 && cost > 75) {
			return "$$$$";
		}
		else {
			return "$$$$+";
		}
	}
	public String toString() {		
		return super.getName() + " " + "(" + super.getLocation() + ")" + "\n\tPrice: " + getCostToSymbols() + "\n\tRating: " + ratingToStars(); 
	}
}
