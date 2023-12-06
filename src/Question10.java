import java.util.Scanner;

public class Question10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digits:");
        int input=sc.nextInt();
       int a= input/100000%10;
       int b=input/10000%10;
       int c=input/1000%10;
       int d=input/100%10;
       int e=input/10%10;
       int f=input/10;
       int g=input;

       System.out.println(a+""+b+""+c+""+d+""+e);
    }
}
