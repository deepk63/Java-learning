package oct24;

public class Student extends Person{

    int studentId;

    void displayStudent(){
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.studentId = 1;
        student1.name = "Rahul";
        student2.studentId = 2;
        student2.name = "Rohit";
        student3.studentId = 3;
        student3.name = "Ram";

        student1.displayStudent();
        student1.displayInfo();

        student2.displayStudent();
        student2.displayInfo();

        student3.displayStudent();
        student3.displayInfo();


    }
}
