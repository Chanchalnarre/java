public class paramCons{
    String name;
    int age;

    // Parameterized constructor
    public paramCons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        paramCons student = new paramCons("Chanchal", 18);
        student.display();
    }
}
