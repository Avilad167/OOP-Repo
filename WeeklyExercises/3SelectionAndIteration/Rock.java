import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Rock {
    public static void main(String[] args) {
        String personPlay;
        String computerPlay;
        int computerInt;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Enter your play (R, P, or S : ");
        personPlay = scan.next();
        personPlay.toUpperCase(Locale.ROOT);
        computerInt = generator.nextInt(3);
        System.out.println("computer" + computerInt);
        computerPlay = Integer.toString(computerInt);
        switch (computerInt) {
            case 1:
                System.out.println("R");
                break;
            case 2:
                System.out.println("P");
                break;
            case 3:
                System.out.println("S");
                break;
        }
        System.out.println("computers play:" + computerPlay);
        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R")) {
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors.  You win!!");
            else
                System.out.println("Paper covers rock. computer wins ");}
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("R"))
                System.out.println("Paper covers rock. You wim!!");
            else
                System.out.println("Scissors cut paper. computer wins");}
        else if (personPlay.equals("S")) {
            if (computerPlay.equals("P"))
                    System.out.println("scissors cut paper. you win!!");
            else
                    System.out.println("Rock crushes Scissors. computer wins");}
        else
            System.out.println("invalid play");


        }
    }
