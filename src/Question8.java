import java.util.Scanner;

public class Question8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number");
        float number=sc.nextFloat();
        System.out.println("The square of the no is: "+number*number);
        System.out.println("The cube of the no is: "+number*number*number);
        System.out.println("The fourth power of the no is: "+number*number*number*number);
    }
}
