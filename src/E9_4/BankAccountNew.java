package E9_4;

public class BankAccountNew {
    protected double balance;

    public BankAccountNew(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else{
            throw new IllegalArgumentException("You don't have sufficient Balance");
        }
    }
}
