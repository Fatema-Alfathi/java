import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int f;

        System.out.println("Enter first number: ");
        int g = read.nextInt();
        System.out.println("Enter second number: ");
        int h = read.nextInt();

        f = g + h;
        System.out.println(g + "+" + h + "=" + f);
        System.out.println(g + "-" + h + "=" + (g - h));
        System.out.println(g + "*" + h + "=" + (g * h));
        System.out.println(g + "/" + h + "=" + (g / h));


    }
}