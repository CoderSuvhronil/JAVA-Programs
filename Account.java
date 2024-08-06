import java.util.Scanner;

class Account {
    String name;
    String panNumber;
    String customerId;
    double balance;
    double rateOfInterest;

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Balance: " + balance);
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class Current extends Account {
    String accountType = "Current";

    Current() {
        this.rateOfInterest = 1.0;
    }

    @Override
    void withdraw(double amount) {
        if (balance + 10000 >= amount) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. New Balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

class Savings extends Account {
    String accountType = "Savings";

    Savings() {
        this.rateOfInterest = 4.0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Savings Account Details:");
        Savings savings = new Savings();
        System.out.print("Name: ");
        savings.name = scanner.nextLine();
        System.out.print("PAN Number: ");
        savings.panNumber = scanner.nextLine();
        System.out.print("Customer ID: ");
        savings.customerId = scanner.nextLine();
        System.out.print("Initial Balance: ");
        savings.balance = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("\nSavings Account Info:");
        savings.printInfo();
        savings.deposit(1000);
        savings.withdraw(500);
        savings.withdraw(7000);

        System.out.println("\nEnter Current Account Details:");
        Current current = new Current();
        System.out.print("Name: ");
        current.name = scanner.nextLine();
        System.out.print("PAN Number: ");
        current.panNumber = scanner.nextLine();
        System.out.print("Customer ID: ");
        current.customerId = scanner.nextLine();
        System.out.print("Initial Balance: ");
        current.balance = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.println("\nCurrent Account Info:");
        current.printInfo();
        current.deposit(5000);
        current.withdraw(7000);
        current.withdraw(15000);

        scanner.close();
    }
}
