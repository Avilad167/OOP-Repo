import java.util.Scanner;
public class Square {
    public static void main(String[] args){
        int length;
        double perimeter;
        double area;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter length of square: ");
        length = scan.nextInt();
        perimeter = (length) * 4;
        area = (length) * (length);
        System.out.println("The perimeter of square is " + perimeter);
        System.out.println("The area of square is " + area);

    }
}
