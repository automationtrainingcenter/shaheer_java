package collections;
/*
 * List is a collection type or an inbuilt data structure in Java
 * which is used to multiple data
 * List is an interface in Java
 * ArrayList and LinkedList are the classes which implements List interface
 * list is used to store multiple values of similar data type
 * ArrayList is same as an array which will store multiple values of similar data type
 * in continuous memory locations, but the ArrayList size dynamic
 * LinkedList will not store the data in continuous memory locations, it will store
 * in random locations. 
 * List is index based and index number starts from 0
 * List allows duplicate data also
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		// create a list
		List<String> courses = new LinkedList<String>();
		
		// size() is used to find the number of items in a collection
		System.out.println(courses.size());
		
		// isEmpty() is used to verify a collection is empty or not
		System.out.println(courses.isEmpty());
		
		// add() is used to an item t5523556 o the list
		courses.add("java");
		courses.add("python");
		courses.add("manual testing");
		courses.add("selenium");
		courses.add("webservices testing");
		courses.add("Flask");
		courses.add("Django");
		
		System.out.println(courses.size());
		
		// print all the values of list
		System.out.println(courses);
		
		// retrieve the data from the list
		System.out.println(courses.get(0));
		
		for(String course : courses) {
			System.out.println(course);
		}
		
		// every collection contains iterator() which returns Iterator interface reference
		// we can use this iterator interface reference to retrieve the data from  collection
		Iterator<String> it = courses.iterator();
		/*
		 * Iterator interface contains two methods hasNext() and next()
		 * hasNext() returns true if that collection contains next element
		 * next() will return that next element
		 * 
		 * for each loop will load the entire collection in the memory to iterate over it
		 * Iterator interface will load single item from the collection in the memory
		 */
		System.out.println("retrieving data using iterator interface");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		// inserting data in between two items
		courses.add(3, "selenium with java");
		System.out.println(courses);
		
		
		// updating data
		courses.set(4, "selenium with python");
		System.out.println(courses);
		
		// deleting data
		courses.remove(1);
		System.out.println(courses);
		
		courses.remove("Django");
		System.out.println(courses);
	
		// search for a data in collection
		System.out.println(courses.contains("selenium with Java"));
		
		// clear() to remove all the data
		courses.clear();
		
		System.out.println(courses);
		
	}
	

}
