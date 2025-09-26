package day01;
import java.util.Scanner;

public class practicalSecond {

    public static void main (String[] args){

        // programme for Calculating the area of circle
        Scanner scanner = new Scanner(System.in);
        double pi = Math.PI;

        double r ;

        System.out.print("enter the radius of the circle " );
        r = scanner.nextDouble();

       double area = pi * r * r ;

        System.out.print("Area of the circle is : " + area + "cm²");
    }
}
