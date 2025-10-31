package Q1;

public class StudentManager {
    Student[] studentList;   // Array to hold students
    int count;               // Keeps track of number of students

    public StudentManager() {
        studentList = new Student[10];  // max 10 students for simplicity
        count = 0;
    }

    // Add a student
    public void addStudent(Student student) {
        studentList[count] = student;
        count++;
    }

    // Search for a student by ID
    public void searchStudent(int studentID) {
        for (int i = 0; i < count; i++) {
            if (studentList[i].studentID == studentID) {
                studentList[i].displayStudentDetails();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Update GPA by ID
    public void updateStudentGPA(int studentID, double newGPA) {
        for (int i = 0; i < count; i++) {
            if (studentList[i].studentID == studentID) {
                studentList[i].updateGPA(newGPA);
                System.out.println("___GPA updated!____");
               //searchStudent(studentID);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    // Display all students
    public void displayAllStudents() {
        for (int i = 0; i < count; i++) {
            studentList[i].displayStudentDetails();
        }
    }
}
