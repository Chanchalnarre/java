public class myCar{
    String carName;
    String colour;

    // Zero-arguments constructor
    public myCar() {
        carName = "Porsche";
        colour = "Blue";
    }

    public void display() {
        System.out.println("Name: " + carName);
        System.out.println("Colour: " + colour);
    }

    public static void main(String[] args) {
        myCar car = new myCar();
        
        car.display();
    }
}
