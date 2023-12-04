import java.util.Scanner;

public class Question7 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Input distance");
        float distance=sc.nextFloat();
        System.out.println("Input time in hours");
        float hours=sc.nextFloat();
        System.out.println("Input time in minutes");
        float minutes=sc.nextFloat();
        System.out.println("Input time in seconds");
        float seconds= sc.nextFloat();
        float t1=seconds+minutes*60+hours*60*60;
        float mps=distance/t1;
        float d2=distance/1000;
        float t2=hours+(minutes/60)+(seconds/60);
        float kph=d2/t2;
        float d3= distance/1609;
        float miph=d3/t2;
        System.out.println("The speed in meters per second: " + mps);
        System.out.println("The speed in kilometer per hour: "+ kph);
        System.out.println("The speed in miles per hour: "+ miph);
    }
}
