import java.util.*;
class string{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
         System.out.println("Enter your name:");
        String name=s.nextLine();
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(3));
        System.out.println(name.endsWith("m"));
        System.out.println(name.trim());
        System.out.println(name.substring(2,7));
        System.out.println(name.replace("r","hiva"));
        System.out.println(name.lastIndexOf(name));   
    }
}
