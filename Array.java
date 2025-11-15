import java.util.*;

class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0,size;
        float avg;

        System.out.println("Enter the size of the array");  
        size=sc.nextInt();
        int m[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter  the "+(i+1)+"st number :");
            m[i]=sc.nextInt();
            sum=sum+m[i];
        }
        System.out.println("The sum of all the  numbers is :"+sum);
            avg=(float)sum/size;
        System.out.println("The average of the 3 numbers is: "+avg);
        System.out.println("Thank you....");

    }


}


