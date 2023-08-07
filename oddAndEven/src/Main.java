import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Even and odd numbers
        Scanner read=new Scanner(System.in);
        System.out.println("Print number:  ");
        int w = read.nextInt();
        if(w%2==0){
            System.out.println(w+" :This is even numbers" );
        } else  {
            System.out.println(w+" :This is odd number ");
        }
    }
}