public class Main {
    public static void main(String[] args) {
        Animals dog = new Dog();
        dog.food="Dog food";
        dog.sound="Dog sound";
        dog.makeSound();
        dog.eat();


        Animals baird= new Bird();
        baird.food="bird food";
        baird.sound="bird sound";
        baird.eat();
        baird.makeSound();

        Animals cat= new Cat();
        cat.food="Cat food";
        cat.sound="cat sound";
        cat.eat();
        cat.makeSound();






    }
}

 class Animals{
     String food;
     String sound;
     void eat(){
    }

    void makeSound(){
    }

 }
 class Dog extends Animals{
 }

 class Bird extends Animals{

 }
 class Cat extends Animals{

 }
