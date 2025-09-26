package day01;
import java.util.Scanner;

public class UserInput {
    public static void main (String[] args ){

        //taking input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name :");
        String name = scanner.nextLine();

        System.out.print("\n entered name is :" + name);

        scanner.close();
    }
}
