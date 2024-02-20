import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        String user;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        user = scan.nextLine();
        scan.close();

        String[] words = user.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        System.out.println("Reversed sentence: " + reversedSentence);

    }
}
