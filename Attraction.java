/**
 *  Program #4c
 *  Attraction program
 *  CS108-2
 *  3/12/18
 *  @author Ivan Stus
*/
public class Attraction extends Place {
	private int type;
	private double price;
	
	public Attraction (String name, String description, double latitude, double longitude, double price, int type) {
		super(name, description, latitude, longitude);
		this.type = type;
		this.price = price;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean hasAnimals() {
		if (type == 1 || type == 2) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		if (hasAnimals() == true) {
			return super.getName() + " " + "(" + super.getLocation() + ")" + "\n\tTickets average $" + price + "0 and feature exciting animals";
		}
		else {
			return super.getName() + " " + "(" + super.getLocation() + ")" + "\n\tTickets average $" + price + "0";
		}
	}
}
