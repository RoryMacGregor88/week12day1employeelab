import Staff.Employee;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Colin", 9, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Colin", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(9, developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(5.50, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(1.50);
        assertEquals(7.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        developer.raiseSalary(1.50);
        assertEquals(0.07, developer.payBonus(), 0.01);
    }
}
