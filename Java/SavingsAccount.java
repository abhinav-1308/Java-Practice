public class SavingsAccount {
    private double savingsBalance;
    private int accountNumber;
    private static double annualInterestRate;

    public SavingsAccount(double balance, int accountNumber) {
        this.savingsBalance = balance;
        this.accountNumber = accountNumber;
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (savingsBalance * annualInterestRate) / 12.0;
        savingsBalance += monthlyInterest;
    }

    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public void displayBalance() {
        System.out.printf("Account %d balance: $%.2f\n", accountNumber, savingsBalance);
    }

    public static void main(String[] args) {
        SavingsAccount.modifyInterestRate(0.04);
        SavingsAccount saver1 = new SavingsAccount(2000.0, 1);
        SavingsAccount saver2 = new SavingsAccount(3000.0, 2);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.displayBalance();
        saver2.displayBalance();

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        saver1.displayBalance();
        saver2.displayBalance();
    }
}
