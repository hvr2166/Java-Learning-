package day01;

public class practicalOne {

    public static void main (String[] args){

        // programme for swapping numbers without using third variable

        int x = 5 ;
        int y = 10 ;

        System.out.print("before swap numbers are X : " + x + " || Y :" + y );

        x = x + y ;
        y = x - y ;
        x = x - y ;

        System.out.print("\nAfter swap numbers are X : " + x + " || Y :" + y );
    }
}
