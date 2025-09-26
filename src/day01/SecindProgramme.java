package day01;

public class SecindProgramme {
    public static void main (String[] args){

        //learnig about different types of data types present

        char gender = 'M';
        String name = "Learnig Java";
        int age = 20 ;
        double pi = 3.14 ;
        boolean isAdmin = true ;
        //in case isAdmin is false then the else condition runs
        if(isAdmin){
            System.out.print("Admin gender is : " + gender + "\n and the repo name is : " + name + "\n age of admin is:" + age );
        }else{
            System.out.print("admin is not here and this is double data type check " + pi);
        }
    }
}
