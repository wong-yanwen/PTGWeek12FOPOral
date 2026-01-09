/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author Wong Yan Wen
 */
public class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;
    int overtimeHours;
    double Total;
    
    
    PartTimeEmployee(String employeeId, String name, String department, double hourlyRate, int hoursWorked, int overtimeHours){
        super(employeeId, name , department);
        this.hourlyRate= hourlyRate;
        this.hoursWorked = hoursWorked;
        this.overtimeHours = overtimeHours;
    }
    
    @Override
    public double calculateSalary(){
        Total = (hoursWorked * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
        return Total;
    }

    
    @Override
    public double calculateTax(){
        double Tax = Total*0.03;
        return Tax;
    }
    
    @Override
     public void displayInfo(){
       
      
            double regularHoursPay = hoursWorked *hourlyRate;
            double overtimeHours1=hourlyRate * 1.5;
            double overtimeHoursPay = overtimeHours* overtimeHours1;
            double Tax = calculateTax();

            System.out.println("== Employee Records==");
            System.out.println("Part-Time Employee");
            super.displayInfo();
            System.out.printf("Hourly Rate: RM %.2f \n",hourlyRate);
            System.out.printf("Regular Hours: %d @ RM %.2f = RM %.2f\n",hoursWorked, hourlyRate,regularHoursPay);
            System.out.printf("Overtime Hours: %d @ RM %.2f = RM %.2f \n",overtimeHours,overtimeHours1,overtimeHoursPay);
            System.out.printf("Total Salary: RM %.2f\n",Total);
            System.out.printf("Tax(3%%): RM %.2f\n",Tax);
            System.out.printf("Net Salary: RM %.2f\n",Total-Tax);
            System.out.println("");   
        
    }
    
}
