/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.riyajivani;

import java.util.*;

/**
 *
 * @author riyaj
 */
public class StringNumberAddition {

    public int addition(String numbers){
        
        if(numbers.isEmpty()){
            return 0;
        }
        
        numbers = numbers.replaceAll("[^0-9-]+", ",");
        
        if(numbers.replace(",", "").isEmpty()){
            return 0;
        }
        
        String[] nums = numbers.split(",");
        int addition = 0;
        
        List<String> negativenums = new ArrayList<>();
        
        for(String num : nums){
            if(!num.isEmpty()){
                if(Integer.parseInt(num)<0){
                    negativenums.add(num);
                }else{
                  addition += Integer.parseInt(num);
                } 
            }
        }
        
        if(!negativenums.isEmpty()){
            throw new IllegalArgumentException("Negative numbers not allowed.");
        }
        else
        {
        return addition;
        }
    }    
}
