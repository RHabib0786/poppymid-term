package datastructure;

import databases.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		List<User>list =new ArrayList<User>();

		list.add(new User("Rubaya","ID1112","07-02-1986"));
		list.add(new User ("Sam","ID1113","12-03-1990"));
		list.add(new User ("Emily","ID1114","09-02-1981"));
		list.add(new User ("kimberly","ID1115","01-09-1969"));

		for(User user:list) {
			System.out.println(user.getStName() + " " + user.getStID() + " " + user.getStDOB());
		}
		Iterator<User> it= list.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		it.remove();





		}


	

	}

}
