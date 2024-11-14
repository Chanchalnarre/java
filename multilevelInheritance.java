class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Mammal extends Animal {
    public void walk() {
        System.out.println("Mammal is walking");
    }
}
class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  
        dog.walk(); 
        dog.bark(); 
    }
}