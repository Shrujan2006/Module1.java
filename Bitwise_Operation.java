import java.util.Scanner;

public class Bitwise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;

       
        System.out.println("\nResults:");
        System.out.println("Bitwise AND:");
        System.out.println(a + " & " + b + " = " + and + " (binary: " + Integer.toBinaryString(and) + ")");

        System.out.println("Bitwise OR:");
        System.out.println(a + " | " + b + " = " + or + " (binary: " + Integer.toBinaryString(or) + ")");

        System.out.println("Bitwise XOR:");
        System.out.println(a + " ^ " + b + " = " + xor + " (binary: " + Integer.toBinaryString(xor) + ")");

        scanner.close();
    }
}
