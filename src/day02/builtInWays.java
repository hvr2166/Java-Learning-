package day02;
import java.util.Random;

public class builtInWays {


    public static void main (String[] args){

        //understand the different built in methods or say functions which came in use frequently
        // 1.  Going to generate the random numbers and can be used to generate any data type
        Random random = new Random();

        int number ;
        number = random.nextInt(1 , 7);

        System.out.println(number);

        boolean Toss ;
        Toss = random.nextBoolean();

        if(Toss){
            System.out.println("It's HEAD");
        }else{
            System.out.println("It's TAIL");
        }

        // 2. working with the built in math methods

    }
}
