/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author Wong Yan Wen
 */

public class FullTimeEmployee extends Employee {
    private double allowance;
    private double bonus;
    private int yearsOfService;
    
    int taxPercentage;
    double Total;
    double Tax;

    
    public FullTimeEmployee(String employeeId, String name, String department, double baseSalary, double allowance, int yearsOfService, double bonus){
        super(employeeId,name,department,baseSalary);
        this.allowance=allowance;
        this.yearsOfService=yearsOfService;
        this.bonus= bonus;
        
    }
    @Override
    public double calculateSalary(){
        Total = baseSalary + allowance + bonus + (yearsOfService * 100);
        return Total;
    }
    
    @Override
    public double calculateTax() {
      
      if (Total > 5000) {
        taxPercentage=10;
        Tax=Total*10/100;  
      
      }else{
        taxPercentage=5;
        Tax=Total*5/100;  
      }       
        return Tax;
    }
    
    
    @Override
    public void displayInfo(){
        System.out.println("== Employee Records==");
        System.out.println("Full-Time Employee");
        //calling parent
        super.displayInfo();
        System.out.printf("Base salary: RM %.2f \n",baseSalary);
        System.out.printf("Allowance: RM %.2f\n",allowance);
        System.out.printf("Bonus: RM %.2f\n",bonus);
        System.out.printf("Service Increment: RM %.2f (%d years)\n",(yearsOfService*100.00),yearsOfService);
        System.out.printf("Total Salary: RM %.2f \n",Total);
        
        
        if (Total>5000)
            System.out.printf("Tax (10 %%): RM %.2f\n",Tax);
        else 
            System.out.printf("Tax(5 %%): RM %.2f\n",Tax);
        
        System.out.printf("Net Salary: RM %.2f \n",Total-Tax);
        System.out.println("");
    }
    
    
    
}
