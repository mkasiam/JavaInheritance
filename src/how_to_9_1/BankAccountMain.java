package how_to_9_1;

public class BankAccountMain {
    protected double balance;

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
        }else {
            throw new RuntimeException("You don't have sufficient balance");
        }
    }

    public void monthEnd(){
        //End of the month
    }
}
