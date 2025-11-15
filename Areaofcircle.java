import java.util.*;
public class CircleArea {
    public static void main(String[] args) {
        System.out.println("Enter the radius of circle : ");
      Scanner  sc = new Scanner(System.in);
      
        double radius =sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.printf("Area of circle: %.3f \n", area);
    }
}
