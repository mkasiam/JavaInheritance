package how_to_9_1;

public class SavingsAccount extends BankAccountMain{

    private double interestRate;
    private double minBalance;


    public SavingsAccount(){
        balance = 0;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (balance < minBalance)
        {
            minBalance = balance;
        }
    }

    @Override
    public void monthEnd() {
        double interest = minBalance * interestRate / 100;
        deposit(interest);
        minBalance = getBalance();
    }

}
