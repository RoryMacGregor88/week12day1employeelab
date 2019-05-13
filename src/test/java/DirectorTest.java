import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Kat", 2, 1000.00, 200.00);
    }

    @Test
    public void hasName() {
        assertEquals("Kat", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals(2, director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(1000.00);
        assertEquals(2000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(10.00, director.payBonus(), 0.01);
    }

    @Test
    public void getBudget(){
        assertEquals(200, director.getBudget(), 0.01);
    }
}
