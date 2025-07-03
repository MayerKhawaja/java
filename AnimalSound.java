abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal {
   void makeSound(){
    System.out.println("Woof!Woof!");
   }
}
public class AnimalSound {
   public static void main(String[] args) {
    Animal dog = new Dog();
    dog.makeSound();
   }
    
}