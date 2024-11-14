class Animal{
    
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class methOverriding{
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        Animal myDog = new Dog(); 

        myAnimal.makeSound(); 
        myDog.makeSound(); 
    }
}
