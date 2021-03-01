/**
 *  Program #4b
 *  Place program
 *  CS108-2
 *  3/07/18
 *  @author Ivan Stus
*/
public class Place extends Location implements Comparable<Place> {
	private String name;
	private String description;
	private Location location;
	
	public Place(String name, String description, double latitude, double longitude) {
		this.name = name;
		this.description = description;
		this.location = new Location(latitude, longitude);		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setLocation(double latitude, double longitude) {
		this.location = new Location(latitude, longitude);		
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Location getLocation() {
		return location;
	}
	public String toString() {
		return name + "," + description + "," + location;
	}
	public String getIdentificationString() {
		return ("Program 5b, Ivan Stus, csscxxxx");
	}
	@Override
	public int compareTo(Place otherPlace) {		
		return this.name.compareTo(otherPlace.name);
	}
	public boolean equals(Place otherPlace) {
		if (this.name == otherPlace.name) {
			return true;
		} else {
			return false;
		}		
	}
}
