/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.riyajivani;

/**
 *
 * @author riyaj
 */
public class StringNumberAddition {

    public int addition(String numbers){
        
        if(numbers.isEmpty()){
            return 0;
        }
        
        String[] nums = numbers.split(",");
        int addition = 0;
        
        for(String num : nums){
            addition += Integer.parseInt(num);
        }
        return addition;
    }
    
}
