import java.util.Scanner;
public class Convert {
    public static void main(String[] args){
        float miles;
        double km;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the distance in Miles: ");
        miles = scan.nextFloat();
        km = (miles) * 1.60935;
        System.out.println("The distance in kilometer is " + km );

    }
}
