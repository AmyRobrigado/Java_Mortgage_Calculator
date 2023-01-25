import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in); // this is to grab user data

        System.out.println("Enter loan amount: ");
        double principal = ui.nextDouble();
        System.out.println("Loan amount: " + NumberFormat.getCurrencyInstance().format(principal));

        System.out.println("Enter your down payment: ");
        double downPayment = ui.nextDouble();
        System.out.println("Down Payment Amount:" + downPayment);

        System.out.println("Enter interest rate:");
        double interest = (ui.nextDouble()/100)/12;
        System.out.println("Interest is :" + interest);

        System.out.println("Loan term in years:");
        double months = ui.nextDouble()*12;
        System.out.println("Loan term in months:" + months);

        double payment = calculator.Mortgage(principal,downPayment,interest,months);

        System.out.println("Your monthly payment is:" + NumberFormat.getCurrencyInstance().format(payment));
        System.out.println("Your bi-weekly payment is:" + NumberFormat.getCurrencyInstance().format(payment/2));

        ui.close();
    }
}
