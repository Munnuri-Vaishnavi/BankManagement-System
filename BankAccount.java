import java.util.Scanner;

public class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double initialBalance) {
        accountHolder = name;
        balance = initialBalance;
    }

    public void addAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " added successfully.");
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount myAccount = new BankAccount("Vaishnavi", 0);

        System.out.println("Welcome, " + myAccount.accountHolder + "!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Add Amount");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    myAccount.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to add: ₹");
                    double addAmt = scanner.nextDouble();
                    myAccount.addAmount(addAmt);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmt = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmt);
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}