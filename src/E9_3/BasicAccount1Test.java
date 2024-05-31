package E9_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicAccount1Test {

    BasicAccount1 account1, account2, account3;
    @BeforeEach
    void setUp() {
        account1 = new BasicAccount1(5000);
        account2 = new BasicAccount1(15000);
        account3 = new BasicAccount1(69000);
    }

    @Test
    void getBalanceAfterWithdrawAccount1() {
        account1.getWithdraw(4000);
        account1.getWithdraw(5000);
        account1.getWithdraw(1000);
        assertEquals(940.0,account1.getBalance());
    }

    @Test
    void getBalanceAfterWithdrawAccount2() {
        account2.getWithdraw(4000);
        account2.getWithdraw(5000);
        account2.getWithdraw(1000);
        account2.getWithdraw(8000);
        assertEquals(4970.0,account2.getBalance());
    }

    @Test
    void getBalanceAfterWithdrawAccount3() {
        account3.getWithdraw(40000);
        account3.getWithdraw(500000);
        account3.getWithdraw(1000);
        assertEquals(27970.0,account3.getBalance());
    }
}