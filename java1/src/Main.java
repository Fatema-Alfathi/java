import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        print in java:
        Scanner read = new Scanner(System.in);
        System.out.println("This is first code in github!");

//        Data Type :
        int a = 1;
        double b = 2.2;
        String c = "java";
        boolean d = true;
        boolean e = false;

//        (+,-,* two numbers)

        int f;

        System.out.println("Enter first number: ");
        int g = read.nextInt();
        System.out.println("Enter second number: ");
        int h = read.nextInt();

        f = g + h;
        System.out.println(g + "+" + h + "=" + f);
        System.out.println(g + "-" + h + "=" + (g - h));
        System.out.println(g + "*" + h + "=" + (g * h));

//        print name hello

        System.out.println("Enter your name");
        String i = read.next();
        System.out.println("Welcome in our system " + i);

//        Operators
        System.out.println(2 > 3);
        System.out.println(3 < 4);
        System.out.println(4 != 5);
        System.out.println(2 == 3);


    }
}
