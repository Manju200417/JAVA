class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Dog eats a food");
    }
}
public class Sinheritance8 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();
    }
}
