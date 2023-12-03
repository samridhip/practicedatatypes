import java.util.Scanner;

public class Question2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the measurement");
        double measurement=sc.nextDouble();
        System.out.println("The measurement in meters is:"+(measurement*0.0254));
    }
}

