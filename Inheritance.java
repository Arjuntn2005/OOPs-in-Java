import java.util.Scanner;

class Employee{
    String name, address;
    int age, salary;
    long phone;

    void printSalary() {
        System.out.println("salary: "+salary);
    }

    void printEmployee() {
        System.out.println("name : "+name);
        System.out.println("age: "+age);
        System.out.println("phone No.: "+phone);
        System.out.println("address: "+address);
    }
}

class Officer extends Employee{
    String specialization;
    void printSpecialization(){
        System.out.println("Specialization: "+specialization);
    }
}

class Manager extends Employee{
    String department;
    void printDepartment(){
        System.out.println("Department: "+department);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Officer o= new Officer();
        Manager m= new Manager();

        System.out.println("Officers details:");
        System.out.print("name:");
        o.name=s.nextLine();
        System.out.print("address:");
        o.address=s.nextLine();
        System.out.print("Specialization :");
        o.specialization=s.nextLine();
        System.out.print("age:");
        o.age=s.nextInt();
        System.out.print("phone: ");
        o.phone=s.nextLong();
        System.out.print("Salary :");
        o.salary=s.nextInt();
        s.nextLine();
        System.out.println("\nManager details:");
        System.out.print("name:");
        m.name=s.nextLine();
        System.out.print("address:");
        m.address=s.nextLine();
        System.out.print("Department :");
        m.department=s.nextLine();
        System.out.print("age:");
        m.age=s.nextInt();
        System.out.print("phone:");
        m.phone=s.nextLong();
        System.out.print("Salary :");
        m.salary=s.nextInt();

        System.out.println("\nOfficer Details:");
        o.printEmployee();
        o.printSpecialization();
        o.printSalary();
        System.out.println("\nManager Details:");
        m.printEmployee();
        m.printDepartment();
        m.printSalary();
    }
}





