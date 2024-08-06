import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Supervisor extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Supervisor supervisor = new Supervisor();
        System.out.println("Enter Supervisor Details:");
        System.out.print("Name: ");
        supervisor.name = scanner.nextLine();
        System.out.print("Age: ");
        supervisor.age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Phone Number: ");
        supervisor.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        supervisor.address = scanner.nextLine();
        System.out.print("Salary: ");
        supervisor.salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Specialization: ");
        supervisor.specialization = scanner.nextLine();

        Manager manager = new Manager();
        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        manager.name = scanner.nextLine();
        System.out.print("Age: ");
        manager.age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Phone Number: ");
        manager.phoneNumber = scanner.nextLine();
        System.out.print("Address: ");
        manager.address = scanner.nextLine();
        System.out.print("Salary: ");
        manager.salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Department: ");
        manager.department = scanner.nextLine();

        System.out.println("\nSupervisor Details:");
        System.out.println("Name: " + supervisor.name);
        System.out.println("Age: " + supervisor.age);
        System.out.println("Phone Number: " + supervisor.phoneNumber);
        System.out.println("Address: " + supervisor.address);
        supervisor.printSalary();
        System.out.println("Specialization: " + supervisor.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary();
        System.out.println("Department: " + manager.department);

        scanner.close();
    }
}

