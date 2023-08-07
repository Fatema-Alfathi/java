import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //A program to calculate the remaining life of the user until the user reaches the age of 100 years

        Scanner read= new Scanner(System.in);
       System.out.println("Welcome in our system");
        System.out.println("Enter your name");
       String name =read.next();
        System.out.println("Welcome " + name);

        System.out.println( "Enter your age");
        int age = read.nextInt();
        int a =100;
        a= a-age;
        System.out.println(" to access  100 to " + a);


    }
}