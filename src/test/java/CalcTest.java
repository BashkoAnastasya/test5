import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;


public class CalcTest {
    Calc Calculator;

    @Before
    public void setUp() throws Exception {
        this.Calculator = new Calc();
    }

    @After
    public void tearDown() throws Exception {
        Calculator = null;
    }

    @Test

    public void GetSumPosPosDouble() throws Exception {
        System.out.println("Pos+Pos");
        assertEquals(4.9, Calculator.getSum(2.3, 2.6), 0.01);
    }

    @Test
    public void GetSumNegNegInt() throws Exception {
        System.out.println("Neg+Neg");
        assertEquals(-11, Calculator.getSum(-5, -6), 0.01);
    }

    @Test
    public void GetSumPosNull() throws Exception {
        System.out.println("Pos+0");
        assertEquals(2, Calculator.getSum(2, 0), 0.01);
    }


    @Test
    public void testGetMultiplicationPosPos() throws Exception {
        System.out.println("Pos*Pos");
        assertEquals(4.84, Calculator.getMultiplication(2.2, 2.2), 0.01);
    }

    @Test
    public void testGetMultiplicationPosNeg() throws Exception {
        System.out.println("Pos*Neg");
        assertEquals(-4.84, Calculator.getMultiplication(2.2, -2.2), 0.01);
    }


    @Test
    public void testGetMultiplicationNegNeg() throws Exception {
        System.out.println("Neg*Neg");
        assertEquals(4.84, Calculator.getMultiplication(-2.2, -2.2), 0.01);
    }

    @Test
    public void testGetMultiplicationPosNull() throws Exception {
        System.out.println("Pos*Null");
        assertEquals(0, Calculator.getMultiplication(2, 0), 0.01);
    }

    @Test
    public void testGetMinusPosPos() throws Exception {
        System.out.println("Pos-Pos");
        assertEquals(0, Calculator.getMinus(2, 2), 0.01);
    }

    @Test
    public void testGetMinusPosNeg() throws Exception {
        System.out.println("Pos-Neg");
        assertEquals(4.4, Calculator.getMinus(2.3, -2.1), 0.01);
    }

    @Test
    public void testGetMinusNegNeg() throws Exception {
        System.out.println("Neg-Neg");
        assertEquals(-0.2, Calculator.getMinus(-2.3, -2.1), 0.01);
    }


    @Test
    public void testGetDivisionPosPos() throws Exception {
        System.out.println("Pos/Pos");
        assertEquals(1, Calculator.getDivision(2, 2), 0.01);
    }

    @Test
    public void testGetDivisionNegNeg() throws Exception {
        System.out.println("Neg/Neg");
        assertEquals(1.095, Calculator.getDivision(-2.3, -2.1), 0.01);
    }

    @Test
    public void testGetDivisionPosNeg() throws Exception {
        System.out.println("Neg/Neg");
        assertEquals(-1.095, Calculator.getDivision(2.3, -2.1), 0.01);
    }


    @Test
    public void testOperationPlus() {
        System.out.println("Test operation +");
        assertEquals("+", 7, Calculator.calculator(3, 4, '+'), 0.01);
    }

    @Test
    public void testOperationMultiplication() {
        System.out.println("Test operation *");
        assertEquals("*", 12, Calculator.calculator(3, 4, '*'), 0.01);
    }

    @Test
    public void testOperationMinus() {
        System.out.println("Test operation -");
        assertEquals("-", -1, Calculator.calculator(3, 4, '-'), 0.01);
    }

    @Test
    public void testOperationDivision() {
        System.out.println("Test operation /");
        assertTrue(Calculator.calculator(3, 1, '/') == 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperationDivOnNull() {
        System.out.println("Test / on null");
        assertEquals("/null", 1, Calculator.calculator(3.3, 0, '/'), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOperationNo() {
        System.out.println("Test not correct operation");
        assertEquals("not operation", 1, Calculator.calculator(3.3, 0, '1'), 0.01);
    }


}













