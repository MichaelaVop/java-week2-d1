import java.util.Scanner;
import java.lang.Math;

public class Payroll {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter employee's name: ");
        String name = input.next();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.println("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.println("Enter federal tax withholding rate (%): ");
        double federalTax = input.nextDouble();
        double fedTPerc = federalTax / 100.0;
        System.out.println("Enter state tax withholding rate (%): ");
        double stateTax = input.nextDouble();
        double stateTPerc = stateTax / 100.0;

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Pay rate: $" + payRate);

        double grossPay = hours * payRate;
        System.out.println("Gross Pay: $" + grossPay);

        System.out.println("Deductions:");

        double deductFed = (grossPay * fedTPerc) * 100.0;
        double dedFedTotal = Math.round(deductFed) / 100.0;
        System.out.println("\t" + "Federal Withholding (" + federalTax + "%): $" + dedFedTotal);

        double deductState = (grossPay * stateTPerc) * 100.0;
        double dedStTotal = Math.round(deductState) / 100.0;
        System.out.println("\t" + "State Withholding: (" + stateTax + "%): $" + dedStTotal);

        double total = dedFedTotal + dedStTotal;
        System.out.println("\t" + "Total Deduction: $" + total);

        double netPay = grossPay - total;
        System.out.println("Net Pay: $" + netPay);

    }
}