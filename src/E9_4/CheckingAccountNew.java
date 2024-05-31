package E9_4;

public class CheckingAccountNew extends BankAccountNew {

    private int overdraft;
    public CheckingAccountNew(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        overdraft++;
        if (overdraft == 1) {
            super.withdraw(20);
        }else {
            super.withdraw(30);
        }
    }

    public void monthEnd() {
        overdraft = 0;
    }
}
