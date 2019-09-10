package collections;
/*
 * Same as List, Set is also an inbuilt data structure in Java and it is an interface
 * and is used to store collections similar values
 * In Set we can't store duplicate data
 * Set is not index based and in general it won't maintain any order for the data
 * Set Interface is implemented by
 * HashSet : it will not maintain any order for the data 
 * LinkedHashSet : it will maintain insertion order for the data
 * TreeSet : it will maintain ascending for numeric data and alphabetical for character data
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// create a set
//		Set<String> courses = new HashSet<>();
//		Set<String> courses = new LinkedHashSet<>();
		Set<String> courses = new TreeSet<>();
		// size() is used to find the number of items in a collection
		System.out.println(courses.size());

		// isEmpty() is used to verify a collection is empty or not
		System.out.println(courses.isEmpty());

		// add the data to the set
		courses.add("java");
		courses.add("python");
		courses.add("manual testing");
		courses.add("selenium");
		courses.add("webservices testing");
		courses.add("Flask");
		courses.add("django");
		courses.add("java");
		courses.add("python");

		System.out.println(courses.size());

		// print the values of collection
		System.out.println(courses);

		courses.add("DevOps");
		System.out.println(courses);

		// retrieve the data from the set using for each loop
		for (String course : courses) {
			System.out.println(course);
		}

		// every collection contains iterator() which returns Iterator interface
		// reference
		// we can use this iterator interface reference to retrieve the data from
		// collection
		Iterator<String> it = courses.iterator();
		/*
		 * Iterator interface contains two methods hasNext() and next() hasNext()
		 * returns true if that collection contains next element next() will return that
		 * next element
		 * 
		 * for each loop will load the entire collection in the memory to iterate over
		 * it Iterator interface will load single item from the collection in the memory
		 */
		System.out.println("retrieving data using iterator interface");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		// remove data from the set
		courses.remove("selenium");
		System.out.println(courses);
		
//		to update the data remove old data and new data
		courses.remove("DevOps");
		courses.add("AWS");
		System.out.println(courses);
		
		// clear() which will remove all the data
		courses.clear();
		System.out.println(courses);
		
	}
}
