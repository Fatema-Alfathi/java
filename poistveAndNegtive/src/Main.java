import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
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
