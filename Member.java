class Member1 {
    String name;
    int age;
    String phoneNumber;
    String address;
     double salary;

    public Member1(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Employee extends Member1 {
   String specialization;

     Employee(String name, int age, String phoneNumber,String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends Member1{
     String department;

    Manager(String name, int age, String phoneNumber,String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

public class Member {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", 25, "555-555-55", "Home", 25631.5, "IT");
        Manager manager = new Manager("Ron", 30, "555-617-55", "Earth", 69586.5, "IT");
        employee.printSalary();
        manager.printSalary();
    }
}