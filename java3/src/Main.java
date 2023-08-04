import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Multiplication, addition and subtraction operations
        Scanner read=new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = read.nextInt();
        System.out.println("Enter the operation (+,-,*");
        String b= read.next();
        System.out.println("Enter number: ");
        int c=read.nextInt();

        switch (b){
            case "+":
                System.out.println(a+ "+"+ c+"="+ (a+c));
                break;

            case "-":
                System.out.println(a+"-"+c+"="+(a-c));
                break;
            case "*":
                System.out.println(a+"*"+" "+c+"="+(a*c));
        }


    }
}