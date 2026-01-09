/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author Wong Yan Wen
 */
public class Contractor extends Employee {
    private double totalSales;
    private double totalSalary;
    private final double agencyFee=100.00;

       
    public Contractor(String employeeId, String name, String department,double totalSales){
        super(employeeId,name,department);
        this.totalSales=totalSales;  
        this.baseSalary=500;
    }
   
    @Override
    public double calculateSalary(){
        this.totalSalary = baseSalary+(totalSales*0.5)-agencyFee;
        return totalSalary;
    }
    
    @Override
    public void displayInfo(){
        System.out.println("== Employee Records==");
        System.out.println("Contractor");
        super.displayInfo();
        System.out.printf("Base Salary: RM %.2f\n",baseSalary);
        System.out.printf("Total Sales: RM %.2f\n",this.totalSales);
        System.out.printf("Agency Fee: RM %.2f\n",this.agencyFee);
        System.out.printf("Total Salary: RM %.2f\n",calculateSalary());
        System.out.println("");
    }
}
