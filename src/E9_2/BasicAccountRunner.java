package E9_2;

public class BasicAccountRunner {
    public static void main(String[] args) {
        BasicAccount account1 = new BasicAccount(5000);
        BasicAccount account2 = new BasicAccount(10000);
        account2.getWithdraw(500);
        account1.getWithdraw(500000);
    }
}
