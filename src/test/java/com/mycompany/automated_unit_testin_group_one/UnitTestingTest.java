/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automated_unit_testin_group_one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ryan
 */
public class UnitTestingTest {
    
    public UnitTestingTest() {
    }

    @org.junit.jupiter.api.Test
    public void testAdditionMethod() {
        // Create an Instance of the class
        UnitTesting ut = new UnitTesting();
        
        int expected = 4;
        int actual = ut.addition(2,2);
        
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void testSubtractionMethod() {
        UnitTesting ut = new UnitTesting();
        
        int expected = 6;
        int actual = ut.addition(10,4);
        
        assertEquals(expected,actual);
        
    }

    @org.junit.jupiter.api.Test
    public void testMessage() {
       
        UnitTesting ut = new UnitTesting();
        
        String expected = "Hello World!";
        String actual = ut.message();
        
        assertEquals(expected,actual);
    }
    
}
