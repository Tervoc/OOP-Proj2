/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno_cards;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Troll
 */
public class CardTest {
    //private Card instance;
    public CardTest() {
    }
    
    @Before
    public void setUp() {
        System.out.println("* CardTest: Before setup");
        //Card instance = new Card(0, 1, Card.CardTypes.normal);
    }
    
    @After
    public void tearDown() {
       // instance = null;
    }

    /**
     * Test of getCardColorAsText method, of class Card.
     */
    @Test
    public void testGetCardColorAsText() {
        System.out.println("getCardColorAsText");
        Card instance = new Card(0, 1, Card.CardTypes.normal);
        String expResult = "Red";
        String result = instance.getCardColorAsText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardTypeAsText method, of class Card.
     */
    @Test
    public void testGetCardTypeAsText() {
        System.out.println("getCardTypeAsText");
       Card instance = new Card(0, 1, Card.CardTypes.normal);
        String expResult = "normal";
        String result = instance.getCardTypeAsText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardColor method, of class Card.
     */
    @Test
    public void testGetCardColor() {
        System.out.println("getCardColor");
       Card instance = new Card(0, 1, Card.CardTypes.normal);
        int expResult = 0;
        int result = instance.getCardColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardValue method, of class Card.
     */
    @Test
    public void testGetCardValue() {
        System.out.println("getCardValue");
      Card instance = new Card(0, 1, Card.CardTypes.normal);
        int expResult = 1;
        int result = instance.getCardValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardType method, of class Card.
     */
    @Test
    public void testGetCardType() {
        System.out.println("getCardType");
      Card instance = new Card(0, 1, Card.CardTypes.normal);
        Card.CardTypes expResult = Card.CardTypes.normal;
        Card.CardTypes result = instance.getCardType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
