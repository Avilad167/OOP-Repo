import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        double r;
        double p = 3.14;
        double v;
        double sa;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        r = scan.nextDouble();
        v = (4 * p * r * r * r) / 3;
        sa = 4 * p * r * r;
        System.out.println("Volume is : " + v);
        System.out.println("Surface Area is : " + sa );

    }
}
