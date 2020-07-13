package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> Q =new LinkedList<String>();
				Q.add("Math");
				Q.add("English");
				Q.add("Art");
				Q.add("Health");
				Q.add("Dance");
				System.out.println("queue:" + Q + "\n");
		System.out.println("Queue:" + Q.peek());

		String removedElement= Q.remove();
		System.out.println("removedElements: " + removedElement);
		System.out.println("queue:" + Q + "\n");

		removedElement=Q.poll();
		System.out.println("removedElement:" + removedElement);
		System.out.println("queue:" + Q + "\n");

		Iterator<String> it= Q.iterator();
		System.out.println("Element at the top queue :");
		while (it.hasNext()){
			System.out.println(it.next());
		}



	}

}
