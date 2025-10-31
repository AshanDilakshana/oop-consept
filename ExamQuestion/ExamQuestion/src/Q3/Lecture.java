package Q3;

public class Lecture extends Person{

    private String employeeId;
    private String department;
    
    
    
	public Lecture(String name, int age, String email, String employeeId, String department) {
		super(name, age, email);
		this.employeeId = employeeId;
		this.department = department;
	}
    
    
    
    
	 @Override
	    public void displayDetails() {
	        System.out.println("Lecturer Details:");
	        System.out.println("Name: " + getName());
	        System.out.println("Age: " + getAge());
	        System.out.println("Email: " + getEmail());
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Department: " + department);
	        System.out.println("--------------------------");
	    }
    
}
