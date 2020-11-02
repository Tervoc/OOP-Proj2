/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Troll
 */
public class HandTest {
    
    public HandTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of newHand method, of class Hand.
     */
    @Test
    public void testNewHand() {
        System.out.println("newHand");
        Deck deckIn = null;
        int numCards = 0;
        Hand instance = null;
        instance.newHand(deckIn, numCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortHand method, of class Hand.
     */
    @Test
    public void testSortHand() {
        System.out.println("sortHand");
        Hand instance = null;
        instance.sortHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHand method, of class Hand.
     */
    @Test
    public void testGetHand() {
        System.out.println("getHand");
        Hand instance = null;
        ArrayList<Card> expResult = null;
        ArrayList<Card> result = instance.getHand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumRed method, of class Hand.
     */
    @Test
    public void testGetNumRed() {
        System.out.println("getNumRed");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumRed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumYellow method, of class Hand.
     */
    @Test
    public void testGetNumYellow() {
        System.out.println("getNumYellow");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumYellow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumBlue method, of class Hand.
     */
    @Test
    public void testGetNumBlue() {
        System.out.println("getNumBlue");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumBlue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumGreen method, of class Hand.
     */
    @Test
    public void testGetNumGreen() {
        System.out.println("getNumGreen");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumGreen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumRedTotal method, of class Hand.
     */
    @Test
    public void testGetNumRedTotal() {
        System.out.println("getNumRedTotal");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumRedTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumYellowTotal method, of class Hand.
     */
    @Test
    public void testGetNumYellowTotal() {
        System.out.println("getNumYellowTotal");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumYellowTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumBlueTotal method, of class Hand.
     */
    @Test
    public void testGetNumBlueTotal() {
        System.out.println("getNumBlueTotal");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumBlueTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumGreenTotal method, of class Hand.
     */
    @Test
    public void testGetNumGreenTotal() {
        System.out.println("getNumGreenTotal");
        Hand instance = null;
        int expResult = 0;
        int result = instance.getNumGreenTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
