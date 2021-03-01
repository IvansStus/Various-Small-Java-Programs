/**
 *  Program #3a
 *  Location program
 *  CS108-2
 *  3/05/18
 *  @author Ivan Stus
*/
public class Location {
private final double EARTH_RADIUS_MILES =  3963.1676;
private double latitude;
private double longitude;
public Location() {
	
}
public Location(double latitude, double longitude) {
	this.latitude = latitude;
	this.longitude = longitude;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public double distanceFrom(Location other) {
	double lat1 = Math.toRadians(this.latitude);
	double lon1 = Math.toRadians(this.longitude);
	double lat2 = Math.toRadians(other.latitude);
	double lon2 = Math.toRadians(other.longitude);
	double cosC = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1-lon2);
	double arcLenC = Math.acos(cosC);
	return arcLenC;
}
public boolean equals(Location o) {
	if (latitude == o.latitude && longitude == o.longitude) {
		return true;
	} else {
		return false;
	}
}
public String toString() {
	return "latitude:" + latitude + ",longitude:" + longitude;
}
}
