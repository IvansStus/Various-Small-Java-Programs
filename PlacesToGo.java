import java.util.ArrayList;
import java.util.Collections;

/**
 *  Program #5b
 *  PlacesToGo program
 *  CS108-2
 *  3/19/18
 *  @author Ivan Stus
*/
public class PlacesToGo extends Place {
	public static void main(String[] args) {
		ArrayList<Place> places = initList();
	}
	public PlacesToGo(String name, String description, double latitude, double longitude) {
		super(name, description, latitude, longitude);
		// TODO Auto-generated constructor stub
	}

	private static ArrayList<Place> initList() {
	ArrayList<Place> list = new ArrayList<>();
	Place[] cities = {
	new Place("New York", "One very large city", 100.2, 150.1283),
	new Place("Los Angeles", "City of angels", 54.89, -100.30)
	};
	Eatery[] restaurants = {
	new Eatery("Chilis", "American sized food", 36.265, 127.387, "American", 30, 3),
	new Eatery("Panda Express", "My Favorite Place", -117.479, -27.968, "Chinese", 10, 4)
	};
	Attraction[] fun = {
	new Attraction("County Fair", "Janky rides", -23.27, 237.387, 25, 3),
	new Attraction("San Diego Zoo", "Harambe lives in our hearts", -45.27, 28.39, 40, 1)
	};{
	for (Place b: cities)
		list.add(b);
	for (Eatery e : restaurants)
        list.add(e);
    for (Attraction a : fun)
        list.add(a);
	for (Place places: list)
		System.out.println(places.toString());
	Collections.sort(list);
	System.out.println();
	for (Place places: list)
		System.out.println(places.toString());
	return list;
}
}
	public String getIdentificationString() {
		return ("Program 5b, Ivan Stus, csscxxxx");
	}
}
