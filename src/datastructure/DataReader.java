package datastructure;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;i


public class DataReader {



	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		System.out.println(System.getProperty("user.dir"));
		BufferedReader br = null;
		String reader;
		List<String> l = new LinkedList<>();
		Stack<String> s = new Stack<>();
		List<String> list = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader("/Users/rubayahabib/eclipse-workspace/MidtermJune2020/src/data/self-driving-car") {

				while((br =reader.brRead())!=null)

				{
					System.out.println(reader);
					String[] words = reader.split(" ");
					list.addAll(Arrays.asList(words));
					s.addAll(Arrays.asList(words));
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

			finally{
			System.out.println("final block");


		}

		}

				}

