import java.util.Scanner;

public class Question6 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter weight in  kgs");
        double weight=sc.nextDouble();
        System.out.println("Enter height in inch");
        double height=sc.nextDouble();
        double formula=weight*2.204/height*0.0254*height*0.0254;
        System.out.println("The body mass index " + formula );

    }
}
