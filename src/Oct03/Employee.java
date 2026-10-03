package Oct03;

public class Employee {
    String name;
    int salary;
    String dept;

    Employee(){

    }

    public Employee(String name, int salary, String dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    void employeeDetails(){
        System.out.println("Employee Name is " +name+ " with salary of " +salary+ " in " +dept+ " Department.");
    }
}
