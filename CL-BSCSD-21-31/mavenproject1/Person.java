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
public class Person {
    
      // cunstructor  
    public Person(){
        this.first_name="";
        this.last_name=""; 
    }
    
  // methord overlording  
     public Person( String first_name , String last_name){
         this.first_name = first_name;
         this.last_name = last_name; 
     }
     
    private String first_name;
    private String last_name;

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }
    
}
