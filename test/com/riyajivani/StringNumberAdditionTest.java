/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.riyajivani;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author riyaj
 */
public class StringNumberAdditionTest {
    
    @Test
    public void testAddition() {
        StringNumberAddition addition = new StringNumberAddition();
        assertEquals(0,addition.addition(""));
        assertEquals(1,addition.addition("1"));
    }
    
}
