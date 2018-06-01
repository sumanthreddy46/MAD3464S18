/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sday3java;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    String name;
    String address;
    int age;
    Scanner in = new Scanner(System.in);
    
    //default constructor
    Person(){
        name = "Unknown";
        address = "Unknown";
        age = 1;
    }
    
    //parameterized constructor
    Person(String name,String address,int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }
    Person(Person anotherPerson){
        this.name = anotherPerson.name;
        this.address = anotherPerson.address;
        this.age = anotherPerson.age;
        
    }
    void setName(){
        System.out.println("enter Name");
       this.name = in.nextLine();
    }
    String getName(){
        return name;
    }
    
    void setAddress(){
       System.out.println("Enter address");
       this.address = in.nextLine();
       
    }
    String getAddress(){
        return address;
    }
    
    void setAge(){
        System.out.println("enter age");
        this.age = Integer.parseInt(in.nextLine());
        
    }
    int getAge(){
        return age;
    }
    
    void setData(){
        setName();
        setAddress();
        setAge();
    }
    
    @Override
    public String toString(){
        String data = " Name :" +name + "\n address : " + address + "\n age : "+ age;
        return data;
    }
}
