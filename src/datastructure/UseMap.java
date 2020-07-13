package datastructure;

import databases.User;


import java.util.HashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Map<Integer,User>name=new HashMap<Integer, User>();
		name.put(1, new User ("Rubaya","ID1112","07-02-1986"));
		name.put(2, new User ("Sam","ID1113","12-03-1990"));
		name.put(3, new User ("Emily","ID1114","09-02-1981"));
		name.put(4, new User ("kimberly","ID1115","01-09-1969"));

		for(Map.Entry<Integer, User>profile:name.entrySet()){
			System.out.println(profile.getKey()+ " "+profile.getValue().getStName()
					+ " " +profile.getValue().getStID()+ " "+profile.getValue().getStDOB());


		}




	}

}
