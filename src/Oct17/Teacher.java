package Oct17;

public class Teacher {

    String name;
    int salary;
    static String school;

    static void details(){
        String name = "Babita";
        int salary = 30000;
        System.out.println("Teacher " + name + " has a salary of " + salary);
    }

    void display(){
        System.out.println("Teacher " + name + " has a salary of " + salary);
    }

    static {
        school = "Conestoga College\uD83D\uDE00";
        System.out.println();
        System.out.println(" ======= " + school + " ======= ");
        System.out.println();
    }
}
