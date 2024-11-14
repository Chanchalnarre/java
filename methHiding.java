class SuperClass{
    
    public static void display() {
        System.out.println("Static method in SuperClass");
    }
}

class SubClass extends SuperClass {
   
    public static void display() {
        System.out.println("Static method in SubClass");
    }
}

public class methHiding{
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        SuperClass subClassAsSuper = new SubClass();
        SubClass subClass = new SubClass();

        superClass.display(); 
        subClassAsSuper.display(); 
        subClass.display(); 
    }
}
