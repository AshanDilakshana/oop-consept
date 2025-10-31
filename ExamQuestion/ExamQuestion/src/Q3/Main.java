package Q3;

public class Main {

	public static void main(String[] args) {
		
		  // Create an array
		Person[] people = new Person[4];
		
		// Add multiple instances 
        people[0] = new Student("Alice", 21, "alice@student.edu", "S1001", "Computer Science");
        people[1] = new Student("Bob", 22, "bob@student.edu", "S1002", "Information Systems");
        people[2] = new Lecture("Dr. Smith", 45, "smith@uni.edu", "L2001", "Software Engineering");
        people[3] = new Lecture("Dr. Mary", 39, "mary@uni.edu", "L2002", "Networking");

		
	
	
	// Loop 
    for (Person p : people) {
        p.displayDetails(); // calls overridden methods
    }
    
	}

}
