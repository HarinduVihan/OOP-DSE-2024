import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private int empNo;
    private int salary;

    public Employee(String name, int age) {
        super(name, age);
    }

    public void getEmpNoAndSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Number: ");
        this.empNo = scanner.nextInt();
        System.out.println("Enter Salary: ");
        this.salary = scanner.nextInt();
    }

    public void printEmployeeDetails() {
        printDetails();
        System.out.println("Employee Number: " + empNo );
        System.out.println("Salary: " + salary );
    }
}

public class q7 {
    public static void main(String[] args) {
        Employee employee = new Employee("Dilathma", 18);
        employee.getEmpNoAndSalary();
        employee.printEmployeeDetails();
    }
}
