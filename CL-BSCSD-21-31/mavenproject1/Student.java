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
public class Student extends Person{

    public Student() {
        this.id = ""; 
    }

    public Student(String id, String first_name, String last_name) {
        super(first_name, last_name);
        this.id = id;
    }
    
    
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

       
}
