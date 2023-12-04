import java.util.Scanner;

public class Question4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        double minutes=sc.nextDouble();
        int day=24*60;
        minutes= minutes/day;
        double year= minutes/365;

        System.out.println("Conversition of minutes into years " + year);
    }
}
