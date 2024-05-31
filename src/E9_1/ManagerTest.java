package E9_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class ManagerTest {

    Manager manager1, manager2, manager3;

    @BeforeEach
    void setUp() {
        manager1 = new Manager("Abdul Kuddus",5000,500);
        manager2 = new Manager("Abdus Salam",10000,67000);
        manager3 = new Manager("Abdus Sobahan", 5889,9000);

    }

    @Test
    void getSalaryWithBonusForManager1() {
        assertEquals(5500,manager1.getTotalSalary());
    }

    @Test
    void getSalaryWithBonusForManager2() {
        assertEquals(77000,manager2.getTotalSalary());
    }

    @Test
    void getSalaryWithBonusForManager3() {
        assertEquals(14889,manager3.getTotalSalary());
    }
}