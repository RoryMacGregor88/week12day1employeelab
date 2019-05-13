import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Employee employee;
    Manager manager;

    @Before
    public void before() {
        employee = new Manager("BillyBob", 12, 23.55, "management");
        manager = new Manager("Brett", 18, 22.52, "management");
    }

    @Test
    public void hasName() {
        assertEquals("BillyBob", employee.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(12, employee.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(23.55, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetDeptName() {
        assertEquals("management", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        employee.raiseSalary(1.45);
        assertEquals(25.00, employee.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        employee.raiseSalary(1.45);
        assertEquals(0.25, employee.payBonus(), 0.01);
    }
}

