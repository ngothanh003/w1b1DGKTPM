/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.addition;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author LENOVO
 */
public class AdditionTest {
    
    public void testAddition() {
        // Kiểm thử với các giá trị cố định
        assertEquals(4, 2 + 2); 
        assertEquals(0, -1 + 1); 
        assertEquals(10, 5 + 5); 
    }

    @Test
    public void testAdditionWithPositiveNumbers() {
        // Kiểm thử với các số dương
        assertEquals(3, 1 + 2); 
        assertEquals(7, 2 + 5); 
    }
    
    @Test
    public void testAdditionWithNegativeNumbers() {
        // Kiểm thử với các số âm
        assertEquals(-2, -1 - 1); 
        assertEquals(-3, -2 - 1); 
    }

    @Test
    public void testAdditionWithMixedNumbers() {
        // Kiểm thử với các số âm và dương
        assertEquals(0, -1 + 1);
        assertEquals(3, 4 - 1); 
    }
    
}
