package lesson12prob1;
import java.util.*;


public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> usehash = new HashMap<>();
		/*students.forEach(student -> { 
		Key newkey = 	(student.getFirstName(), student.g
		}); */
		
		for (Student student : students)
		{
			Key newkey = new Key (student.getFirstName(), student.getLastName());
			usehash.put(newkey, student);
		}
	
		return usehash;
	}
	
	/*
	Student stud1 = new Student("Adeoye", "Adesina", 4.0, Standing.SENIOR); 
	Student stud2 = new Student("Phillip", "Gideon", 3.8, Standing.SOPHOMORE);
	Student stud3 = new Student("Alex", "Jidoni", 3.9, Standing.JUNIOR);
	Student stud4 = new Student("Kinberly", "Jackson", 4.0, Standing.FRESHMAN);
	*/
	
}
