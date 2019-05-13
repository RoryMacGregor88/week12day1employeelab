import Staff.Employee;
import TechStaff.DataBaseAdmin;
import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataBaseAdminTest {

    DataBaseAdmin dataBaseAdmin;

    @Before
    public void before() {
        dataBaseAdmin = new DataBaseAdmin("Jarrod", 17, 5.50);
    }

    @Test
    public void hasName() {
        assertEquals("Jarrod", dataBaseAdmin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(17, dataBaseAdmin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(5.50, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        dataBaseAdmin.raiseSalary(1.50);
        assertEquals(7.00, dataBaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        dataBaseAdmin.raiseSalary(1.50);
        assertEquals(0.07, dataBaseAdmin.payBonus(), 0.01);
    }
}

