/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.riyajivani;

import static org.hamcrest.CoreMatchers.is;
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
        
        assertEquals(3, addition.addition("1,2"));
        
        assertEquals(8, addition.addition("3\n5"));
        
        assertEquals(13, addition.addition("2@6\\5"));
        
        assertEquals(12, addition.addition("010,2,#"));
        
        assertEquals(36, addition.addition("$(,6;0,12)        18"));
        
        assertEquals(0, addition.addition("Shruti Bhalodia"));
    }
    
    @Test
    public void negativeNumTestAddition(){
        StringNumberAddition addition = new StringNumberAddition();
        try{
            addition.addition("-7,-3,6\\r");
        }catch(IllegalArgumentException e){
            assertThat(e.getMessage(),is("Negative numbers not allowed, -7, -3"));
        }
    }
    
}
