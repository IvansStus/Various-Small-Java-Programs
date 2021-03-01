/**
 *  Program #5a
 *  Destinations program
 *  CS108-2
 *  3/19/18
 *  @author Ivan Stus
*/
import java.util.ArrayList;

public class Destinations {

    public static void main(String[] args) {
        ArrayList<Place> places = initList();
        Eatery pancake = (Eatery) places.get(0);
        Eatery tea = (Eatery) places.get(1);
        Eatery greens = (Eatery) places.get(2);
        Attraction park = (Attraction) places.get(3);
        Attraction aquarium = (Attraction) places.get(4);
        Attraction zoo = (Attraction) places.get(5);            
        for (Place place: places) {        	
        	System.out.println(place.toString()); 
        }        
        System.out.println(pancake.getRating() + " " + pancake.ratingToStars());   
        System.out.println(tea.getRating() + " " + tea.ratingToStars());
        System.out.println(greens.getRating() + " " + greens.ratingToStars());
        System.out.println(park.getName() + " " + park.getDescription());
        System.out.println(aquarium.getName() + " " + aquarium.getDescription());
        System.out.println(zoo.getName() + " " + zoo.getDescription());        
        if (tea.getLocation() == greens.getLocation()) {
        	System.out.println("true");
        } else {
        	System.out.println("false");
        }        
        if (pancake.getCuisine() == greens.getCuisine()) {
        	System.out.println("true");
        } else {
        	System.out.println("false");
        }        
        if (aquarium.getType() == zoo.getType()) {
        	System.out.println("true");
        } else {
        	System.out.println("false");
        }
    }

    private static ArrayList<Place> initList() {
        ArrayList<Place> list = new ArrayList<>();
        Eatery[] restaurants = {
                new Eatery("Original Pancake House","Breakfast",32.815274,-117.1546500,"casual dining",14.0,4),
                new Eatery("Tea Station","Asian cafe with tea drinks",32.76049,-117.06739,"casual dining",8.0,3),
                new Eatery("Tender Greens","2400 Historic Decatur Rd",32.73547,-177.21601,"casual dining",26.0,4)
        };
        Attraction[] fun = {
                new Attraction("PetCo Park","Padres Baseball",32.708129,-117.157036,37.0,0),
                new Attraction("Birch Aquarium at Scripps Institution of Oceanography",
                        "Fish Aquarium",32.865776,-117.250518, 18.50, 1),
                new Attraction("San Diego Zoo","Animal Park",32.735316,-117.149046,52.0,2)
        };
        for (Eatery e : restaurants)
            list.add(e);
        for (Attraction a : fun)
            list.add(a);

        return list;
    }
    public String getIdentificationString() {
		return ("Program 5a, Ivan Stus, csscxxxx");
	}
}