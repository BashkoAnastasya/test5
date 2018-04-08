import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class CalcTest {
    Calc classCalc ;
    @Before
    public void setUp() throws Exception {
        this.classCalc = new Calc();
    }

    @After
    public void tearDown() throws Exception {
        classCalc = null;
    }
    @Test
    public void testGetSum() throws Exception {
        System.out.println("testGetSum()");
        assertEquals(15, classCalc.getSum(7,8),0.01);
    }
    @Test
    public void testGetDil() throws Exception {
        System.out.println("testGetDil()");
        assertEquals(2,classCalc.getDil(2,1),0.01);
    }
    @Test
    public void testGetUmn() throws Exception {
        System.out.println("testGetUmn()");
        assertEquals(2,classCalc.getUmn(2,1),0.01);
    }
    @Test
    public void testGetMinus() throws Exception {
        System.out.println("testGetMinus()");
        assertEquals(1,classCalc.getMinus(2,1),0.01);
    }
    @Test(expected = IllegalArgumentException.class)
    public void dil() {
        System.out.println("Деление на ноль");
        assertEquals("dil na 0", 878, classCalc.getDil(4, 0),0.01);
    }

}

