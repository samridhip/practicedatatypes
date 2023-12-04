import java.util.Scanner;

public class Question9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Sum of the number is "+a+b);
        System.out.println("Diff between the number is "+(a-b));
        System.out.println("Product of the number is "+ a/b);
        System.out.println("Average of the number is "+(a+b/2));
        System.out.println("Distance between two number is "+Math.abs(a-b));
        System.out.println("Largest number is "+Math.max(a,b));
        System.out.println("Smallest number is "+Math.min(a,b));
    }
}
