import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// while loop
        Scanner read= new Scanner(System.in);

//        Increasing numbers from 0 to 14
        int i=0;
        while (i<15){
            System.out.println(i);
            i++;
        }

//        Decreasing numbers from 10 to 1
        int q=10;
        while (q>0){
            System.out.println(q);
            q--;
        }

//        It prints the name of Oman 5 times
        System.out.println("Enter number: ");
        int w= read.nextInt();

        while (w<=5){
            System.out.println("Oman");
            w++;
        }
    }
}