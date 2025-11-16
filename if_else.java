import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("The number "+number+" positive.");
        } else if (number < 0) {
            System.out.println("The number "+number+" negative.");
        } else {
            System.out.println("The number "+number+" zero.");
        }

        scanner.close();
    }
}