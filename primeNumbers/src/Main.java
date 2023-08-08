import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int i =1;

       do {
            if (i!=1 && i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0
            || i==2 || i==3 || i==4 || i==5 || i==7){
                System.out.println(i+ " Prime numbers");
            }
            i++;
        }
        while (i <=100);

        System.out.println("From 1 to 100");


    }

}





