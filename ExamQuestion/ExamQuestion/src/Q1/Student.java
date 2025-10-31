package Q1;


public class Student {
    int studentID;
    String name;
    int age;
    String major;
    double gpa;

    // Default constructor
    public Student() {
        studentID = 0;
        name = "";
        age = 0;
        major = "";
        gpa = 0.0;
    }

    // Method to update GPA
    public void updateGPA(double newGPA) {
        gpa = newGPA;
    }

    
    // Method to display details
    public void displayStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + gpa);
        System.out.println("-----------------------");
    }

	
    
    
    
}
