package Q3;

public class Student extends Person {
		
	private String studentId;
    private String major;

	public Student(String name, int age, String email, String studentId, String major) {
		super(name, age, email);
		this.studentId = studentId;
		this.major = major;
	}

	
	 @Override
	    public void displayDetails() {
	        System.out.println("Student Details:");
	        System.out.println("Name: " + getName());
	        System.out.println("Age: " + getAge());
	        System.out.println("Email: " + getEmail());
	        System.out.println("Student ID: " + studentId);
	        System.out.println("Major: " + major);
	        System.out.println("--------------------------");
	    }
}
