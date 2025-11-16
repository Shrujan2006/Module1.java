import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birth = sc.nextInt();

        int age = 2025 - birth;
        System.out.println("Your age is: " + age);
    }
}
