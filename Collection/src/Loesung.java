import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class Loesung {

	public static void main(String[] args) {

		int size = 100000;
		ArrayList<Integer> array = new ArrayList<>(size);
		Vector<Integer> vector = new Vector<>(size);
		LinkedList<Integer> linkedList = new LinkedList<>();
		HashSet<Integer> hashSet = new HashSet<>();
		 TreeSet<Integer> treeSet = new TreeSet<>();

		System.out.println("addAppend: ArrayList ");
		addAppend(array);
		System.out.println();

		System.out.println("addAppend: Vector");
		addAppend(vector);
		System.out.println();

		System.out.println("addAppend: LinkedList");
		addAppend(linkedList);
		System.out.println();

		System.out.println("addAppend: HashSet");
		addAppend(hashSet);
		System.out.println();

		System.out.println("addAppend: TreeSet");
		addAppend(treeSet);
		System.out.println();

		
		System.out.println("addAhead: ArrayList ");
		addAhead(array);
		System.out.println();
		
		 System.out.println("addAhead: Vector");
		 addAhead(vector);
		 System.out.println();
		
		 System.out.println("addAhead: LinkedList");
		 addAhead(linkedList);
		 System.out.println();
		
		 System.out.println("addAhead: HashSet");
		 addAhead(hashSet);
		 System.out.println();
		
		 System.out.println("addAhead: TreeSet");
		 addAhead(treeSet);
		 System.out.println();

		 
		 System.out.println("Binärsuche Vektor: ");
		 search(vector);
		 System.out.println();
		
		 System.out.println("Binärsuche ArrayList");
		 search(array);
		 System.out.println();
		
		 
		 System.out.println("Suche2: ArrayList ");
		 search2(array);
		 System.out.println();
		
		 System.out.println("Suche2: Vector");
		 search(vector);
		 System.out.println();
		
		 System.out.println("Suche2: LinkedList");
		 search(linkedList);
		 System.out.println();
		
		 System.out.println("Suche2: HashSet");
		 search2(hashSet);
		 System.out.println();
		
		 System.out.println("Suche2: TreeSet");
		 search2(treeSet);
		
	}

	public static void addAppend(Collection<Integer> list) {
		int size = 100000;

		// Startzeit
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			list.add(i);
		}

		// Endzeit holen
		long end = System.currentTimeMillis();
		// Zeit in Millisekunden
		long durationInMsec = end - start;
		System.out.println("Startzeit: " + start);
		System.out.println("Endzeit: " + end);
		System.out.println("benötigte Zeit: " + durationInMsec + " millis");

	}

	public static void addAhead(Collection<Integer> list) {
		int size = 100000;
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < size; i++) {
			addFirst(list, i);
		}
		// Endzeit holen
		long end = System.currentTimeMillis();
		// Zeit in Millisekunden
		long durationInMsec = end - start;
		System.out.println("Startzeit: " + start);
		System.out.println("Endzeit: " + end);
		System.out.println("benötigte Zeit: " + durationInMsec + " millis");
	}
	
	public static void addFirst(Collection<Integer> list, int i ){
		
		if(list.getClass()== ArrayList.class){
			((ArrayList<Integer>)list).add(0, i);
		}else if(list.getClass()== Vector.class){
			((Vector<Integer>)list).add(0, i);
		}else if(list.getClass()== LinkedList.class){
			((LinkedList<Integer>)list).addFirst(i);
		}
		
	}
	
	public static void iterate(Collection<Integer> list) {
		Iterator<Integer> iter = list.iterator();

		long start = System.currentTimeMillis();

		while (iter.hasNext()) {
			Integer lastValue = iter.next();
			if (iter.hasNext() == false) {
				System.out.println("letzter Wert: " + lastValue);
			}
		}

		// Endzeit holen
		long end = System.currentTimeMillis();
		// Zeit in Millisekunden
		long durationInMsec = end - start;
		System.out.println("Startzeit: " + start);
		System.out.println("Endzeit: " + end);
		System.out.println("benötigte Zeit: " + durationInMsec + " millis");
	}

	public static void search(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		Collections.binarySearch(list, 9999);

		// Endzeit holen
		long end = System.currentTimeMillis();
		// Zeit in Millisekunden
		long durationInMsec = end - start;
		System.out.println("Startzeit: " + start);
		System.out.println("Endzeit: " + end);
		System.out.println("benötigte Zeit: " + durationInMsec + " millis");

	}

	public static void search2(Collection<Integer> list) {
		long start = System.currentTimeMillis();

		list.contains(9999);
		
		// Endzeit holen
		long end = System.currentTimeMillis();
		// Zeit in Millisekunden
		long durationInMsec = end - start;
		System.out.println("Startzeit: " + start);
		System.out.println("Endzeit: " + end);
		System.out.println("benötigte Zeit: " + durationInMsec + " millis");

	}
}
