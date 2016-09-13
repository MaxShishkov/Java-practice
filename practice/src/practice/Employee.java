/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.io.*;
/**
 *
 * @author Max
 */
public class Employee {
    
    private static int id = 1233;
    
    String name;
    int age;
    String designation;
    double salary;
    
    
   //constructor
    public Employee(String name)
    {
        this.name = name;
    }
    
    public void empAge(int age)
    {
        this.age = age;
    }
    
    public void empDeignation(String empDesignation)
    {
        designation = empDesignation;
    }
    
    public void empSalary(double empSalary)
    {
        salary = empSalary;
    }
    
    public void getId()
    {
        System.out.println(id);
    }
    
    public void changeId(int empId)
    {
        id = empId;
    }
    
    public void print()
    {
      System.out.println("Name:"+ name );
      System.out.println("Age:" + age );
      System.out.println("Designation:" + designation );
      System.out.println("Salary:" + salary);
    }
    
}
