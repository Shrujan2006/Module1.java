import java.util.Scanner; 
public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap:");
        int a = sc.nextInt();  
        int b = sc.nextInt();
        System.out.printf("Before Swapping : a = %d and b = %d\n ",a,b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("After swapping : a = %d and b = %d\n ",a,b);
    }
}
