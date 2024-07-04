
import java.util.Scanner;

interface Bank {
    void performTransaction(double amount);
}

class Deposit implements Bank {
    private double balance;

    public Deposit(double balance) {
        this.balance = balance;
    }

    public void performTransaction(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful! New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}

class Withdraw implements Bank {
    private double balance;

    public Withdraw(double balance) {
        this.balance = balance;
    }

    public void performTransaction(double amount) {
        if (amount > 0) {
            if (balance < amount) {
                System.out.println("Insufficient funds!");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful! New balance: " + balance);
            }
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}

public class bank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Create a new bank account
        double initialBalance = 1000;
        Deposit deposit = new Deposit(initialBalance);
        Withdraw withdraw = new Withdraw(initialBalance);

        // Test deposit method
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        deposit.performTransaction(depositAmount);

        // Test withdraw method
        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        withdraw.performTransaction(withdrawAmount);
    }
}
