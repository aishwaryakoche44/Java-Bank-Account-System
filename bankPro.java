import java.util.Scanner;

public class bankPro {
    private String name;
    private double balance;
    private int choice;
    private Scanner scanner;

    // Method to set user data
    void setData(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Method to display user details
    void displayDetails() {
        System.out.println("User Name: " + name);
        System.out.println("Current Balance: " + balance);
    }

    // Menu method
    void menu() {
        switch (choice) {
            case 1:
                System.out.print("Enter Amount to Deposit: ");
                deposit(scanner.nextDouble());
                break;

            case 2:
                System.out.print("Enter Amount to Withdraw: ");
                withdraw(scanner.nextDouble());
                break;

            case 3:
                System.out.println("Available Balance: " + balance);
                break;

            case 0:
                System.out.println("Exiting... Thank you!");
                break;

            default:
                System.out.println("Please enter 0, 1, 2, or 3 only.");
                break;
        }
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        bankPro bank = new bankPro();
        bank.setData("Ajay", 50000); // Initial user name and balance
        bank.displayDetails();

        bank.scanner = new Scanner(System.in);

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            bank.choice = bank.scanner.nextInt();
            bank.menu();
        } while (bank.choice != 0);

        bank.scanner.close();
    }
}