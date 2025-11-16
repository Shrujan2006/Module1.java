import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a number from the user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Use ternary operator to check even or odd
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Display the result
        System.out.println("The number " + number + " is " + result + ".");

        scanner.close();
    }
}
