package how_to_9_1;

public class CheckingAccount extends BankAccountMain {

    private int withdrawals;

    public CheckingAccount() {
        balance = 0;
    }
    @Override
    public void withdraw(double amount) {
        final int FREE_WITHDRAWALS = 3;
        final int WITHDRAWAL_FEE = 1;
        super.withdraw(amount);
        withdrawals++;
        if (withdrawals > FREE_WITHDRAWALS) {
            super.withdraw(withdrawals);
        }
    }
    @Override
    public void monthEnd() {
        withdrawals = 0;
    }
}
