/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kmlnd
 */
public class App {
    public static void main(String[] args) {
                                                                                //<> is called the diamond operator
        List<String> stringList =  new ArrayList<>();
        //default empty list
        System.out.println("List size: " + stringList.size());
        
        //add list
        stringList.add("The first string");
        
        System.out.println("List size: " + stringList.size());
        
        stringList.add("The second string.");
        
        System.out.println("List size: " + stringList.size());
        
        //remove method
        stringList.remove(1);
        
        //printing out size after removing
        System.out.println("List size: " + stringList.size());
        
        stringList.remove(0);
        System.out.println("List size: " + stringList.size());
        
        
        //You have to keep index in bounds. Always make sure you are within in bounds or an error will occur.
        //Below to test/see error.
        //stringList.remove(0);
        //System.out.println(stringList,size());
        
    }
}
