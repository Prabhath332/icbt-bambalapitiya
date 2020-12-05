/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author prabh
 */
public class App {
    
    public static void main(String[] args) {
        
        Student obj = new Student("001", "Prabhath", "Madusanka");
      //  obj.setFirst_name("prabhath");
      //  obj.setLast_name("madusanka");
        
        System.out.println(obj.getFirst_name());
    }   
}
