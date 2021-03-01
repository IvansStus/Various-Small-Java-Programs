/**
 *  Program #6
 *  ArrayList program
 *  CS108-2
 *  4/09/18
 *  @author Ivan Stus
*/
public class MyArrayList<E> extends MyAbstractList<E> implements MyList<E> {
//	public static void main (String[] args) {
//		MyArrayList<Integer> list = new MyArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(1,5);
//	}
	int space = 0;
	E[] mylist;		
	@SuppressWarnings("unchecked")
	public MyArrayList() {
        mylist = (E[]) new Object[10]; 
        size = 0;
    }	
	@SuppressWarnings("unchecked")
	public MyArrayList(int space) {
		mylist = (E[]) new Object[space];
		size = 0;
	}
	@Override
	public boolean add(E data) {
		if (data != null) {
		if (mylist.length == size) {
			@SuppressWarnings("unchecked")
			E[] list = (E[]) new Object[size * 2];
			for (int i = 0; i < mylist.length; i++) {
				list[i] = mylist[i];				
			}
			mylist = list;
		}
		mylist[size] = data;
		size++;
		}				
		return true;
	}
	@Override
	public boolean add(int index, E data) throws IndexOutOfBoundsException {
		if (data != null) {
			if (index < 0 || index >= size) {
				throw new IndexOutOfBoundsException();
			}
			if (mylist.length == size) {
				@SuppressWarnings("unchecked")
				E[] list = (E[]) new Object[size * 2];
				for (int i = 0; i < list.length; i++) {				
					list[i] = mylist[i];
				}
				mylist = list;
			}
			for (int i = index + 1; i < mylist.length-1; i++) {
				mylist[i + 1] = mylist[i];				
			}
		size++;
		mylist[index] = data;		
		}		
		return true;
	}
	@Override
	public void clear() {
		for (int i = 0; i < mylist.length; i++) {
			mylist[i] = null;
		}
	}
	@Override
	public boolean contains(E data) {		
		if (data != null) {		
		for (int i = 0; i < size; i++) {
			if (mylist[i].equals(data)) {
				return true;
			} 
		}
		}
		return false;	
	}
	@Override
	public E get(int index) {		
		return mylist[(int) index];			
	}
	@Override
	public int indexOf(E data) {
		for (int i = 0; i < mylist.length; i++) {
			if (mylist[i].equals(data)) {
				return i;
			}
		}
		return -1;
	}
	@Override
	public int lastIndexOf(E data) {
		return size;		
	}
	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}		
		E word = mylist[index];
		mylist[index] = null;
		for (int i = index + 1; i < mylist.length; i++) {			
			mylist[i - 1] = mylist[i];
		}
		size--;
		return word;
	}
	@Override
	public void trimToSize() {		
		
	}
	public String toString() {
		String results = "[";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				results += mylist[i].toString();
			} else {
			results += mylist[i].toString() + ", ";
			}
		}
		results += "]";
		return results;
		
	}
	public String getIdentificationString() {
		return ("Program 6, Ivan Stus");
	}
}