/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author My User
 */
public class RadioMainTest {
    
    public RadioMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ON method, of class RadioMain.
     */
    @Test
    public void testON() {
        System.out.println("ON");
        RadioMain instance = new RadioMain();
        instance.ON();
        if (!instance.isON()){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of OFF method, of class RadioMain.
     */
    @Test
    public void testOFF() {
        System.out.println("OFF");
        RadioMain instance = new RadioMain();
        instance.OFF();
        if (instance.isON()){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of isON method, of class RadioMain.
     */
    @Test
    public void testIsON() {
        System.out.println("isON");
        RadioMain instance = new RadioMain();
        boolean expResult = true;
        instance.ON();
        boolean result = instance.isON();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getFrequency method, of class RadioMain.
     */
    @Test
    public void testGetFrequency() {
        System.out.println("getFrequency");
        RadioMain instance = new RadioMain();
        String expResult = "FM";
        String result = instance.getFrequency();
        if (!expResult.equals(result)){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of changeFrequency method, of class RadioMain.
     */
    @Test
    public void testChangeFrequency() {
        System.out.println("changeFrequency");
        String freq = "FM";
        RadioMain instance = new RadioMain();
        instance.changeFrequency(freq);
        if (!instance.getFrequency().equals("FM")){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getStation method, of class RadioMain.
     */
    @Test
    public void testGetStation() {
        System.out.println("getStation");
        RadioMain instance = new RadioMain();
        String expResult = "87.9";
        String result = instance.getStation();
        if (!expResult.equals(result)){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setStation method, of class RadioMain.
     */
    @Test
    public void testSetStation() {
        System.out.println("setStation");
        String dial = "88.9";
        RadioMain instance = new RadioMain();
        instance.setStation(dial);
        if(!instance.getStation().equals("88.9")){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of Forward method, of class RadioMain.
     */
    @Test
    public void testForward() {
        System.out.println("Forward");
        RadioMain instance = new RadioMain();
        instance.setStation("87.9");
        instance.Forward();
        // TODO review the generated test code and remove the default call to fail.
        if (!instance.getStation().equals("88.1")){
        fail("The test case is a prototype.");}
    }

    /**
     * Test of Backward method, of class RadioMain.
     */
    @Test
    public void testBackward() {
        System.out.println("Backward");
        RadioMain instance = new RadioMain();
        instance.setStation("88.1");
        instance.Backward();
        // TODO review the generated test code and remove the default call to fail.
        if (!instance.getStation().equals("87.9")){
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setMemory method, of class RadioMain.
     */
    @Test
    public void testSetMemory() {
        System.out.println("setMemory");
        String station = "88.1";
        int position = 1;
        String freq = "FM";
        RadioMain instance = new RadioMain();
        instance.setMemory(station, position, freq);
        if (!Double.toString(instance.getButton1()).equals("88.1")){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton1 method, of class RadioMain.
     */
    @Test
    public void testGetButton1() {
        System.out.println("getButton1");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton1();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton2 method, of class RadioMain.
     */
    @Test
    public void testGetButton2() {
        System.out.println("getButton2");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton2();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton3 method, of class RadioMain.
     */
    @Test
    public void testGetButton3() {
        System.out.println("getButton3");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton3();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton4 method, of class RadioMain.
     */
    @Test
    public void testGetButton4() {
        System.out.println("getButton4");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton4();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton5 method, of class RadioMain.
     */
    @Test
    public void testGetButton5() {
        System.out.println("getButton5");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton5();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton6 method, of class RadioMain.
     */
    @Test
    public void testGetButton6() {
        System.out.println("getButton6");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton6();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton7 method, of class RadioMain.
     */
    @Test
    public void testGetButton7() {
        System.out.println("getButton7");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton7();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton8 method, of class RadioMain.
     */
    @Test
    public void testGetButton8() {
        System.out.println("getButton8");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton8();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton9 method, of class RadioMain.
     */
    @Test
    public void testGetButton9() {
        System.out.println("getButton9");
        RadioMain instance = new RadioMain();
        double expResult = 87.9;
        double result = instance.getButton9();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton10 method, of class RadioMain.
     */
    @Test
    public void testGetButton10() {
        System.out.println("getButton10");
        RadioMain instance = new RadioMain();
        double expResult = 89.7;
        double result = instance.getButton10();
        System.out.println(result);
        if (expResult == result){
        } else {}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton11 method, of class RadioMain.
     */
    @Test
    public void testGetButton11() {
        System.out.println("getButton11");
        RadioMain instance = new RadioMain();
        double expResult = 89.7;
        double result = instance.getButton11();
        if (expResult != result){}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton12 method, of class RadioMain.
     */
    @Test
    public void testGetButton12() {
        System.out.println("getButton12");
        RadioMain instance = new RadioMain();
        double expResult = 89.7;
        double result = instance.getButton12();
        if (expResult != result){}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton1AM method, of class RadioMain.
     */
    @Test
    public void testGetButton1AM() {
        System.out.println("getButton1AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton1AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton2AM method, of class RadioMain.
     */
    @Test
    public void testGetButton2AM() {
        System.out.println("getButton2AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton2AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton3AM method, of class RadioMain.
     */
    @Test
    public void testGetButton3AM() {
        System.out.println("getButton3AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton3AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton4AM method, of class RadioMain.
     */
    @Test
    public void testGetButton4AM() {
        System.out.println("getButton4AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton4AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton5AM method, of class RadioMain.
     */
    @Test
    public void testGetButton5AM() {
        System.out.println("getButton5AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton5AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton6AM method, of class RadioMain.
     */
    @Test
    public void testGetButton6AM() {
        System.out.println("getButton6AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton6AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton7AM method, of class RadioMain.
     */
    @Test
    public void testGetButton7AM() {
        System.out.println("getButton7AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton7AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton8AM method, of class RadioMain.
     */
    @Test
    public void testGetButton8AM() {
        System.out.println("getButton8AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton8AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton9AM method, of class RadioMain.
     */
    @Test
    public void testGetButton9AM() {
        System.out.println("getButton9AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton9AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton10AM method, of class RadioMain.
     */
    @Test
    public void testGetButton10AM() {
        System.out.println("getButton10AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton10AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton11AM method, of class RadioMain.
     */
    @Test
    public void testGetButton11AM() {
        System.out.println("getButton11AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton11AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of getButton12AM method, of class RadioMain.
     */
    @Test
    public void testGetButton12AM() {
        System.out.println("getButton12AM");
        RadioMain instance = new RadioMain();
        double expResult = 530;
        double result = instance.getButton12AM();
        if (expResult != result){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setON method, of class RadioMain.
     */
    @Test
    public void testSetON() {
        System.out.println("setON");
        boolean ON = true;
        RadioMain instance = new RadioMain();
        instance.setON(ON);
        if (!instance.isON()){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton1 method, of class RadioMain.
     */
    @Test
    public void testSetButton1() {
        System.out.println("setButton1");
        double button1 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton1(button1);
        if (instance.getButton1() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton2 method, of class RadioMain.
     */
    @Test
    public void testSetButton2() {
        System.out.println("setButton2");
        double button2 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton2(button2);
        if (instance.getButton2() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton3 method, of class RadioMain.
     */
    @Test
    public void testSetButton3() {
        System.out.println("setButton3");
        double button3 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton3(button3);
        if (instance.getButton3() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton4 method, of class RadioMain.
     */
    @Test
    public void testSetButton4() {
        System.out.println("setButton4");
        double button4 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton4(button4);
        if (instance.getButton4() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton5 method, of class RadioMain.
     */
    @Test
    public void testSetButton5() {
        System.out.println("setButton5");
        double button5 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton5(button5);
        if (instance.getButton5() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton6 method, of class RadioMain.
     */
    @Test
    public void testSetButton6() {
        System.out.println("setButton6");
        double button6 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton6(button6);
        if (instance.getButton6() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton7 method, of class RadioMain.
     */
    @Test
    public void testSetButton7() {
        System.out.println("setButton7");
        double button7 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton7(button7);
        if (instance.getButton7() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton8 method, of class RadioMain.
     */
    @Test
    public void testSetButton8() {
        System.out.println("setButton8");
        double button8 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton8(button8);
        if (instance.getButton8() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton9 method, of class RadioMain.
     */
    @Test
    public void testSetButton9() {
        System.out.println("setButton9");
        double button9 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton9(button9);
        if (instance.getButton9() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton10 method, of class RadioMain.
     */
    @Test
    public void testSetButton10() {
        System.out.println("setButton10");
        double button10 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton10(button10);
        if (instance.getButton10() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton11 method, of class RadioMain.
     */
    @Test
    public void testSetButton11() {
        System.out.println("setButton11");
        double button11 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton11(button11);
        if (instance.getButton11() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton12 method, of class RadioMain.
     */
    @Test
    public void testSetButton12() {
        System.out.println("setButton12");
        double button12 = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton12(button12);
        if (instance.getButton12() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton1AM method, of class RadioMain.
     */
    @Test
    public void testSetButton1AM() {
        System.out.println("setButton1AM");
        double button1AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton1AM(button1AM);
        if (instance.getButton1AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton2AM method, of class RadioMain.
     */
    @Test
    public void testSetButton2AM() {
        System.out.println("setButton2AM");
        double button2AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton2AM(button2AM);
        if (instance.getButton2AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton3AM method, of class RadioMain.
     */
    @Test
    public void testSetButton3AM() {
        System.out.println("setButton3AM");
        double button3AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton3AM(button3AM);
        if (instance.getButton3AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton4AM method, of class RadioMain.
     */
    @Test
    public void testSetButton4AM() {
        System.out.println("setButton4AM");
        double button4AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton4AM(button4AM);
        if (instance.getButton4AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton5AM method, of class RadioMain.
     */
    @Test
    public void testSetButton5AM() {
        System.out.println("setButton5AM");
        double button5AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton5AM(button5AM);
        if (instance.getButton5AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton6AM method, of class RadioMain.
     */
    @Test
    public void testSetButton6AM() {
        System.out.println("setButton6AM");
        double button6AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton6AM(button6AM);
        if (instance.getButton6AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton7AM method, of class RadioMain.
     */
    @Test
    public void testSetButton7AM() {
        System.out.println("setButton7AM");
        double button7AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton7AM(button7AM);
        if (instance.getButton7AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton8AM method, of class RadioMain.
     */
    @Test
    public void testSetButton8AM() {
        System.out.println("setButton8AM");
        double button8AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton8AM(button8AM);
        if (instance.getButton8AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton9AM method, of class RadioMain.
     */
    @Test
    public void testSetButton9AM() {
        System.out.println("setButton9AM");
        double button9AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton9AM(button9AM);
        if (instance.getButton9AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton10AM method, of class RadioMain.
     */
    @Test
    public void testSetButton10AM() {
        System.out.println("setButton10AM");
        double button10AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton10AM(button10AM);
        if (instance.getButton10AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton11AM method, of class RadioMain.
     */
    @Test
    public void testSetButton11AM() {
        System.out.println("setButton11AM");
        double button11AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton11AM(button11AM);
        if (instance.getButton11AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }

    /**
     * Test of setButton12AM method, of class RadioMain.
     */
    @Test
    public void testSetButton12AM() {
        System.out.println("setButton12AM");
        double button12AM = 0.0;
        RadioMain instance = new RadioMain();
        instance.setButton12AM(button12AM);
        if (instance.getButton12AM() != 0.0){
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");}
    }
    
}
