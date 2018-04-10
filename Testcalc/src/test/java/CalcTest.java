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
    public void testGetSum1() throws Exception {
        System.out.println("testGetSum1()");
        assertEquals(4, classCalc.getSum(2,2),0.01);
    }
    @Test
    public void testGetSum2() throws Exception {
        System.out.println("testGetSum2()");
        assertEquals(4.9, classCalc.getSum(2.3,2.6),0.01);
    }
    @Test
    public void testGetSum3() throws Exception {
        System.out.println("testGetSum3()");
        assertEquals(-11, classCalc.getSum(-5,-6),0.01);
    }
    @Test
    public void testGetSum4() throws Exception {
        System.out.println("testGetSum4()");
        assertEquals(2, classCalc.getSum(2,0),0.01);
    }
    @Test
    public void testGetSum5() throws Exception {
        System.out.println("testGetSum5()");
        assertEquals(1000, classCalc.getSum(999,1),0.01);
    }
    @Test
    public void testGetUmn6() throws Exception {
        System.out.println("testGetUmn6()");
        assertEquals(4,classCalc.getUmn(2,2),0.01);
    }
    @Test
    public void testGetUmn7() throws Exception {
        System.out.println("testGetUmn7()");
        assertEquals(4.84,classCalc.getUmn(2.2,2.2),0.01);
    }
    @Test
    public void testGetUmn8() throws Exception {
        System.out.println("testGetUmn8()");
        assertEquals(0,classCalc.getUmn(2,0),0.01);
    }

    @Test
    public void testGetMinus9() throws Exception {
        System.out.println("testGetMinus9()");
        assertEquals(0,classCalc.getMinus(2,2),0.01);
    }
    @Test
    public void testGetMinus10() throws Exception {
        System.out.println("testGetMinus10()");
        assertEquals(-0.2,classCalc.getMinus(-2.3,-2.1),0.01);
    }
    @Test
    public void testGetDil1() throws Exception {
        System.out.println("testGetDil11()");
        assertEquals(1,classCalc.getDel(2,2),0.01);
    }
    @Test
    public void testGetDil2() throws Exception {
        System.out.println("testGetDil12()");
        assertEquals(1.095,classCalc.getDel(-2.3,-2.1),0.01);
    }
    @Test
    public void testGetDil3() throws Exception {
        System.out.println("testGetDil13()");
        assertEquals(1.095,classCalc.getDel(2.3,2.1),0.01);
    }

    @Test
    public void testOperation14() {
        assertEquals("add", 7, classCalc.calculator(3, 4,'+'),0.01);
    }
    @Test
    public void testOperation15() {
        assertEquals("add", 12, classCalc.calculator(3, 4,'*'),0.01);
    }
    @Test
    public void testOperation16() {
        assertEquals("add", -1, classCalc.calculator(3, 4,'-'),0.01);
    }

    @Test
    public void testOperation17() {
        assertTrue(classCalc.calculator(3,1,'/') == 3);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testOperation18() {
        assertEquals("add", 1, classCalc.calculator(3.3, 0,'/'),0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testOperation19() {
        assertEquals("add", 1, classCalc.calculator(3.3, 0,'1'),0.01);


    }



}













