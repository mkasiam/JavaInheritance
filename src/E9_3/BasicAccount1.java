package E9_3;

public class BasicAccount1 extends BankAccount1 {

    public BasicAccount1(double balance) {
        super(balance);
    }

    public void getWithdraw(double amount) {
        if (amount > getBalance()){
            double newBalance = getBalance() - 30;
            setBalance(newBalance);
        } else{
            double newBalance = getBalance() - amount;
            setBalance(newBalance);
        }
    }
}
