/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.util.ArrayList;

/**
 *
 * @author Wong Yan Wen
 */
public class Main {
 
    public static void main (String[] args){
        
        ArrayList<Employee> empList = new ArrayList<>();
        //String employeeId, String name, String department, double baseSalary, double allowance, int yearsOfService, double bonus
        empList.add(new FullTimeEmployee("E001","Anna","IT",5000.00,1000.00,5,100));
        //String employeeId, String name, String department, double hourlyRate, int hoursWorked, int overtimeHours
        empList.add(new PartTimeEmployee("E002","Bob","HR",15.50,8,2));
        //String employeeId, String name, String department,double totalSales
        empList.add(new Contractor("E003","Charlie","IT",400.00));
        
        for (Employee eachEmployee: empList){
            eachEmployee.calculateSalary();
            eachEmployee.calculateTax();
            eachEmployee.displayInfo();
        }
       
        
    }
    
}
