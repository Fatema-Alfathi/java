import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Even and odd numbers
        Scanner read = new Scanner(System.in);
        System.out.println("Print number:  ");
        int w = read.nextInt();
        if(w%2==0){
            System.out.println(w+" :This is even numbers" );
        } else  {
            System.out.println(w+" :This is odd number ");
        }

//        The number is negative or positive
        System.out.println("Enter number :");
        int e= read.nextInt();
         if (e>0){
             System.out.println(e+" This is positive number");
         } else if (e<0) {
             System.out.println(e+ " This is negative number");

         }else {
             System.out.println("This is 0");
         }

    }

}