import java.util.Scanner; 
public class Evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int num = sc.nextInt();  
        if (num % 2 == 0)
            System.out.printf("%d is an Even Number",num);
        else
            System.out.printf("%d is Odd Number ",num);
        sc.close(); 
    }
}

