public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.eat();
        cat.sound();

        Dog dog=new Dog();
        dog.eat();
        dog.sound();

        Bird bird=new Bird();
        bird.eat();
        bird.sound();




    }
}
 abstract class Animals{
     abstract void eat();
     abstract void sound();
 }
 class Cat extends Animals{

     @Override
     void eat() {
         System.out.println("Cat eat");
     }

     @Override
     void sound() {
         System.out.println("Cat sound");
     }
 }

 class Bird extends Animals{

     @Override
     void eat() {
         System.out.println("Brid eat");
     }

     @Override
     void sound() {
         System.out.println("Bird sound");
     }
 }

 class Dog extends Animals{

     @Override
     void eat() {
         System.out.println("Dog eat");
     }

     @Override
     void sound() {
         System.out.println("Dog sound");
     }
 }