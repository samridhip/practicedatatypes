import java.util.Scanner;

public class Question1 {
    public static void main(String[]args){
        Scanner temp=new Scanner(System.in);
        System.out.println("Enter the temp");
        double a=temp.nextDouble();
        System.out.println("The temp in celsius is"+(5*(a-32))/9);
    }
}
