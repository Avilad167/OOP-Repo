import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
       int pin;
       String a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a 4 digit pin number to encrypt: ");
        pin = scan.nextInt();
        a = Integer.toHexString(pin);
        int one = ((int)(Math.random()+1000)*65536);
        int two = ((int)(Math.random()+1000)*65536);

        String oneStr = Integer.toHexString(one);
        String twoStr = Integer.toHexString(two);

        System.out.println(oneStr + a + twoStr);
    }
}
