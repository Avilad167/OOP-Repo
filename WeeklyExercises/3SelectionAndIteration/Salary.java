import java.util.Scanner;
import java.text.NumberFormat;
public class Salary {
    public static void main(String[] args){
        double currentSalary;
        double raise;
        double newSalary;
        double i;
        String rating;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.println("enter your performance rating (Excellent, Good, or Poor: ");
        rating = scan.next();
        if (rating.equals("Excellent")) {
            raise = 0.6;
        }
        else if (rating.equals("Good")) {
            raise = 0.4;
        }
        else {
            raise = 0.15;
        }
        i = currentSalary * raise;
        newSalary = i + currentSalary;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println();
        System.out.println("Current Salary: " + money.format(currentSalary));
        System.out.println("Amount of raise: " + money.format(raise));
        System.out.println("Your new Salary: " + money.format(newSalary));
        System.out.println();
    }
}
