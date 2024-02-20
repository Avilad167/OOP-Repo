import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Dice {
    public static void main(String[] args) {
        int roll1;
        int roll2;
        int roll3;
        int roll4;
        int tr1;
        int tr2;
        double avg1;
        double avg2;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println(" How many sides die 1 have? ");
        roll1 = scan.nextInt();
        System.out.println("How many sides die 2 have? ");
        roll2 = scan.nextInt();
        tr1 = 0;
        tr2 = 0;
        for (int i=0; i<=3; i++){
            roll3 = rand.nextInt(roll1) + 1;
            roll4 = rand.nextInt(roll2) + 1;
            System.out.println("Die 1 roll" + i + "=" + roll3);
            System.out.println("Die 2 roll" + i + "=" + roll4);
            tr1 += roll3;
            tr2 += roll4;
        }
        avg1 = tr1 / 3;
        avg2 = tr2 / 3;
        System.out.println("Die 1 rolled a total of " + tr1 + " and rolled " + avg1 + " on average ");
        System.out.println("Die 2 rolled a total of " + tr2 + " and rolled " + avg2 + " on average ");

    }
}