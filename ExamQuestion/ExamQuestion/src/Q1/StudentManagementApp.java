package Q1;

public class StudentManagementApp {
    public static void main(String[] args) {
    	
        StudentManager manager = new StudentManager();

        // Create 5 students 
        Student s1 = new Student();
        s1.studentID = 1;
        s1.name = "Alice";
        s1.age = 20;
        s1.major = "Computer Science";
        s1.gpa = 3.4;

        Student s2 = new Student();
        s2.studentID = 2;
        s2.name = "Bob";
        s2.age = 21;
        s2.major = "Math";
        s2.gpa = 3.6;

        Student s3 = new Student();
        s3.studentID = 3;
        s3.name = "Charlie";
        s3.age = 22;
        s3.major = "Physics";
        s3.gpa = 3.7;

        Student s4 = new Student();
        s4.studentID = 4;
        s4.name = "Diana";
        s4.age = 20;
        s4.major = "Biology";
        s4.gpa = 3.8;

        Student s5 = new Student();
        s5.studentID = 5;
        s5.name = "Ethan";
        s5.age = 23;
        s5.major = "Engineering";
        s5.gpa = 3.5;        
        
        // Add all to manager
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);
        manager.addStudent(s5);

        
        
        // Search for one student
        System.out.println("Searching for student ID 3:");
        manager.searchStudent(3);

        // Update GPA
        System.out.println("Updating GPA for student ID 3:");
        manager.updateStudentGPA(3, 4.0);

        // Display all students
        System.out.println("All student details:");
        manager.displayAllStudents();
    }
}
