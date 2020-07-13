package parser;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProcessStudentInfo {

	/*
	 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
	 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and
	 * 'C' for 70 to 79.
	 *
	 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map.
	 * Once map has all data, retrieve those data and out put to console.
	 *
	 * Do any necessary steps that require for below successful output.
	 * ......................................................
	 * Student (id= 1) "Ibrahim" "Khan"        		Grade= B
	 * Student (id= 2) "Asif" "Roni"          		Grade= A
	 * Student (id= 3) "Gumani" "Hose"              Grade= A
	 * Student (id= 4) "Sukanto" "Shaha"            Grade= B
	 * Student (id= 5) "MD" "Hossain"               Grade= C
	 * ......................................................
	 *
	 *
	 * Use any databases[MongoDB, Oracle or MySql] to store data and to retrieve data.
	 *
	 */

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//Path of XML data to be read.
		String pathSelenium = System.getProperty("user.dir") + "/src/parser/selenium.xml";
		String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";
		String tag = "id";
		//Create ConnectToSqlDB Object
		ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();
		//Declare a Map with List<String> into it.
		Map<String, List<Student>> list = new LinkedHashMap<String, List<Student>>();
				
				/*Declare 2 ArrayList with Student data type to store Selenium student into one of the ArrayList and
				  Qtp student into another ArrayList. */

		List<Student> seleniumStudents = new ArrayList<Student>();
		List<Student> qtpStudents = new ArrayList<Student>();

		//Create XMLReader object.
		XmlReader xmlReader = new XmlReader();


		//Parse Data using parseData method and then store data into Selenium ArrayList.
		seleniumStudents = xmlReader.parseData(tag, pathSelenium);

		//Parse Data using parseData method and then store data into Qtp ArrayList.
		qtpStudents = xmlReader.parseData(tag, pathQtp);

		//add Selenium ArrayList data into map.
		list.put("Selenium", seleniumStudents);

		//add Qtp ArrayList data into map.
		list.put("QTP", qtpStudents);


		//Retrieve map data and display output.
		for (Map.Entry<String, List<Student>> value : list.entrySet()) {
			List<Student> students = (List<Student>) list.get(value.getKey());
			System.out.println("\n" + value.getKey() + " Student");
			for (Student s : students) {
				String id = s.getId();
				String firstname = s.getFirstName();
				String lastname = s.getLastName();
				String grade = s.getScore();
				System.out.println("Student (id =" + id + ") " + firstname + " " + lastname + "\t\t\tGrade = " + grade);
			}


			//Store Qtp data into Qtp table in Database
			connectToMongoDB.insertIntoMongoDB(seleniumStudents, "qtp");
			//connectToSqlDB.insertDataFromArrayListToMySql(seleniumStudents, "qtp","studentList");

			//Store Selenium data into Selenium table in Database
			List<Student> stList = connectToMongoDB.readStudentListFromMongoDB("Selenium");
			for (Student st : stList) {
				System.out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getScore() + " " + st.getId());

				//Retrieve Qtp students from Database
				//List<Student> stList = connectToMongoDB.readStudentListFromMongoDB("qtp");
				//for(Student st:stList){
				System.out.println(st.getFirstName() + " " + st.getLastName() + " " + st.getScore() + " " + st.getId());
			}

			//Retrieve Selenium students from Database


		}

	}
}