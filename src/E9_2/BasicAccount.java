package E9_2;

public class BasicAccount extends BankAccount{

    public BasicAccount(double balance) {
        super(balance);
    }

    public void getWithdraw(double amount){
        if (amount > getBalance()){
            System.out.println("You don't have sufficient Balance in your Account");
        }else {
            double remainingBalance = getBalance() - amount;
            System.out.println("Width amount: " + amount + " Successful." + "Current Balance is : " + remainingBalance );
            setBalance(remainingBalance);
        }

    }
}
