import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Use the Array with for Loop
        String[] question = {"1+2=", "1-1=", "3+4=", "7==7?"};
        String[] answer = {"3", "0", "7", "true"};
        Scanner read = new Scanner(System.in);
        // to input

        System.out.println("Enter your name: ");
        // massage to input name
        String name = read.next();
        //receives a value in program

        System.out.println("Enter number of question");
        // massage to input number of question
        int q = read.nextInt();

        int count = 0;
        // first value to calculate score

        for (int i = 0; i < q; i++) {
            //Each time the program displays a question (عدد الاسالة هو العدد المدخل من قبل المستخدم)
            System.out.println(question[i]);
            // (i=عداد لأسألة و الأجوبة)يطبع سوال من ليست الاسألة على حسب قيمة i
            String userAns = read.next();
            //يسمح لمستخدم بأدخال اجابة و حفظها في متغير اسمه userAns

            if (userAns.equals(answer[i])) {
                // هنا يساوي الاجابة المدخلة مع الجواب تبع i المحفوظة في array of question
                System.out.println("correct");
                //اذا كان الجواب صحيح
                count = count + 1;
                //نضيف واحد لكل اجابة صحيحة
            } else {
                System.out.println("not correct");
            }
            System.out.println(" your score: " + count);

        }
        System.out.println(" final score " + count + "out of " + q);


    }
}