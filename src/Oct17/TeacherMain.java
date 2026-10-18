package Oct17;

public class TeacherMain {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

        teacher1.name = "Anita";
        teacher1.salary = 20000;

        teacher2.name = "Sunita";
        teacher2.salary = 25000;

        Teacher.details();
        teacher1.display();
        teacher2.display();
    }
}
