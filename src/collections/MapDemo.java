package collections;
/*
 * Same as List and Set, Map is an inbuilt data structure in Java, it is 
 * a collection which is used to multiple values.
 * Map is interface which is implemented by
 * HashMap : will not maintain any order
 * LinkedHashMap : will maintain insertion order
 * TreeMap : will maintain alphabetical order for character data and ascending order
 * for numeric data
 * Map is not index based
 * But Map will store data in key and value pairs
 * key can be of any type and value can be of any type
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		// create a Map
//		Map<String, Integer> courses = new HashMap<>();
//		Map<String, Integer> courses = new LinkedHashMap<>();
		Map<String, Integer> courses = new TreeMap<>();

		// size() is used to find the number of items in a collection
		System.out.println(courses.size());

		// isEmpty() is used to verify a collection is empty or not
		System.out.println(courses.isEmpty());

		// store the data
		courses.put("java", 45);
		courses.put("python", 60);
		courses.put("selenium", 80);
		courses.put("testing", 100);
		courses.put("AWS", 30);
		courses.put("java", 60);

		System.out.println(courses.size());

		// print all the values of map
		System.out.println(courses);

		// retrieve the data from a map we can key
		System.out.println(courses.get("python"));

		// retrieve the keys of map
		Set<String> keys = courses.keySet();
		for (String key : keys) {
			System.out.println(key + "----" + courses.get(key));
		}

		// retrieve values of map
		Collection<Integer> values = courses.values();
		Iterator<Integer> it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// retrieve key and value pairs of the map
		Set<Entry<String, Integer>> kvpairs = courses.entrySet();
		for (Entry<String, Integer> pair : kvpairs) {
			System.out.println(pair.getKey() + ":::::" + pair.getValue());
		}

		// remove() is used to remove a pair from map using key only
		courses.remove("java");
		System.out.println(courses);

		// remove() is used to remove a pair from map using key and value pair
		courses.remove("AWS", 60);
		System.out.println(courses);

		// clear() is used to remove all the values from map
		courses.clear();
		System.out.println(courses);
	}

}
