/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Week12;

/**
 *
 * @author Wong Yan Wen
 */

public abstract class Employee {
    protected String employeeId;
    protected String name;
    protected String department;
    protected double baseSalary;
    
    public Employee(String employeeId, String name, String department){
        this.employeeId= employeeId;
        this.name= name;
        this.department=department;
        
    }
    
    
    public Employee(String employeeId, String name, String department,double baseSalary){
        this.employeeId= employeeId;
        this.name= name;
        this.department=department;
        this.baseSalary=baseSalary;
    }
     
    
    public void displayInfo(){
        System.out.println("Employee id: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
    }
    
    public double calculateTax(){
        double Tax =0;
        return Tax;
    }
    
    //abstract method to be overrriden 
    public abstract double calculateSalary();
    
    
}