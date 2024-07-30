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
        
        //if string is empty then addition should 0.
        if(numbers.isEmpty()){
            return 0;
        }
        
        //replace all non-numeric characters with comma.
        numbers = numbers.replaceAll("[^0-9-]+", ",");
        
        //check whether string is empty or not after replacement.
        if(numbers.replace(",", "").isEmpty()){
            return 0;
        }
        
        //storing comma seperated numbers into string array.
        String[] nums = numbers.split(",");
        
        int addition = 0;
        List<String> negativenums = new ArrayList<>();
        
        //adding non-negative numbers.
        for(String num : nums){
            if(!num.isEmpty()){
                int n = Integer.parseInt(num);
                if(n<0){
                    negativenums.add(num);
                }else{
                    if(!(n>1000))
                        addition += Integer.parseInt(num);
                } 
            }
        }
        
        
        //if presence of negative number, throw exception.
        if(!negativenums.isEmpty()){
            throw new IllegalArgumentException("Negative numbers not allowed, " + String.join(", " ,negativenums));
        }
        else
        {
            return addition;
        }
    } 
}
