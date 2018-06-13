import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class CalcTest {
    Calc classCalc;

    @Before
    public void setUp() throws Exception {
        this.classCalc = new Calc();
    }

    @After
    public void tearDown() throws Exception {
        classCalc = null;
    }


    @Test
    public void GetSumPosPosDouble() throws Exception {
        System.out.println("Pos+Pos");
        assertEquals(4.9, classCalc.getSum(2.3, 2.6), 0.01);
    }

    @Test
    public void GetSumNegNegInt() throws Exception {
        System.out.println("Neg+Neg");
        assertEquals(-11, classCalc.getSum(-5, -6), 0.01);
    }

    @Test
    public void GetSumPosNull() throws Exception {
        System.out.println("Pos+0");
        assertEquals(2, classCalc.getSum(2, 0), 0.01);
    }


    @Test
    public void testGetMultiplicationPosPos() throws Exception {
        System.out.println("Pos*Pos");
        assertEquals(4.84, classCalc.getMultiplication(2.2, 2.2), 0.01);
    }

    @Test
    public void testGetMultiplicationPosNeg() throws Exception {
        System.out.println("Pos*Neg");
        assertEquals(-4.84, classCalc.getMultiplication(2.2, -2.2), 0.01);
    }

    @Test
    public void testGetMultiplicationNegNeg() throws Exception {
        System.out.println("Neg*Neg");
        assertEquals(4.84, classCalc.getMultiplication(-2.2, -2.2), 0.01);
    }

    @Test
    public void testGetMultiplicationPosNull() throws Exception {
        System.out.println("Pos*Null");
        assertEquals(0, classCalc.getMultiplication(2, 0), 0.01);
    }

    @Test
    public void testGetMinusPosPos() throws Exception {
        System.out.println("Pos-Pos");
        assertEquals(0, classCalc.getMinus(2, 2), 0.01);
    }

    @Test
    public void testGetMinusPosNeg() throws Exception {
        System.out.println("Pos-Neg");
        assertEquals(4.4, classCalc.getMinus(2.3, -2.1), 0.01);
    }

    @Test
    public void testGetMinusNegNeg() throws Exception {
        System.out.println("Neg-Neg");
        assertEquals(-0.2, classCalc.getMinus(-2.3, -2.1), 0.01);
    }


    @Test
    public void testGetDivisionPosPos() throws Exception {
        System.out.println("Pos/Pos");
        assertEquals(1, classCalc.getDivision(2, 2), 0.01);
    }

    @Test
    public void testGetDivisionNegNeg() throws Exception {
        System.out.println("Neg/Neg");
        assertEquals(1.095, classCalc.getDivision(-2.3, -2.1), 0.01);
    }

    @Test
    public void testGetDivisionPosNeg() throws Exception {
        System.out.println("Neg/Neg");
        assertEquals(-1.095, classCalc.getDivision(2.3, -2.1), 0.01);
    }


    @Test
    public void testOperationPlus() {
        assertEquals("+", 7, classCalc.calculator(3, 4, '+'), 0.01);
    }

    @Test
    public void testOperationMultiplication() {
        assertEquals("*", 12, classCalc.calculator(3, 4, '*'), 0.01);
    }

    @Test
    public void testOperationMinus() {
        assertEquals("-", -1, classCalc.calculator(3, 4, '-'), 0.01);
    }

    @Test
    public void testOperationDivision() {
        assertTrue(classCalc.calculator(3, 1, '/') == 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperationDivOnNull() {
        assertEquals("/null", 1, classCalc.calculator(3.3, 0, '/'), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperationNo() {
        assertEquals("not operation", 1, classCalc.calculator(3.3, 0, '1'), 0.01);


    }


}













