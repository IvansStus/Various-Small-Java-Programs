/**
 *  Program #7a
 *  GenMethods Program
 *  CS108-2
 *  4/18/18
 *  @author Ivan Stus
*/
import java.util.*;
public class GenMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		Integer[] list = new Integer[n];
		LinkedList<Integer> linked = new LinkedList<Integer>();
		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
			linked.add(list[i]);
		}				
		System.out.println(Arrays.toString(list));
		System.out.println(linked);
		int k = scan.nextInt();		
		linearSearch(list, new Integer(k));		
		if (linearSearch(list, new Integer(k)) == -1) {
			System.out.println("Key " + k + " was not found");
		} else {
			System.out.println("Key " + k + " was found at position " + linearSearch(list, new Integer(k)));
		}
		System.out.println(max(list) + " is the max element");
		int m = scan.nextInt();
		int p = scan.nextInt();
		Integer[][] list2 = new Integer[m][p];
		for (int i = 0; i < list2.length; i++) {
			for (int j = 0; j < list2[i].length; j++) {
				list2[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(list2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(max(list2) + " is the max element");
		ArrayList<Integer> alist = new ArrayList<Integer>(linked);		
		System.out.println(alist);
		removeDuplicates(alist);
		System.out.println(alist);
		shuffle(alist);
		System.out.println(alist);
		System.out.println(max(alist) + " is the max element");		
	}
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> list2 = new ArrayList<E>();
		list2 = list;
		Set<E> hs = new HashSet<>();
		hs.addAll(list);
		list2.clear();
		list2.addAll(hs);
		return list2;
	}
	public static <E> void shuffle(ArrayList<E> list) {
		Random rand = new Random(340L);		
		for (int i = 0; i < 30; i++) {
			int randomNumber = rand.nextInt(list.size());
			E temp = list.get(randomNumber);
			int randomNumber2 = rand.nextInt(list.size());
			E temp2 = list.get(randomNumber2);
			list.set(randomNumber, temp2);
			list.set(randomNumber2, temp);
		}
	}
	public static <E extends Comparable<E>> E max(ArrayList<E> list) {
		E max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(max) > 0) {
				max = list.get(i);
			}
		}
		return max;		
	}
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (key.equals(list[i])) {
				return i;
			}
		}
		return -1;		
	}
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(max) > 0) {
				max = list[i];
			}
		}
		return max;		
	}
	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				if (list[i][j].compareTo(max) > 0) {
					max = list[i][j];
				}
			}			
		}
		return max;		
	}
	public static String getIdentificationString() {
		return ("Program 7, Ivan Stus");
	}
}
