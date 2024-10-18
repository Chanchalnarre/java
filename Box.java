public class Box {
    double width, height, depth;

    public Box() {
        width = 3;
        height = 6;
        depth = 9;
    }

    public Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public Box(double side) {
        width = height = depth = side;
    }

    public double volume() {
        return width * height * depth;
    }

    public static void main(String[] args){
        Box box1 = new Box();
        Box box2 = new Box(10, 20, 30);
        Box box3 = new Box(5);

        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("Volume of box3: " + box3.volume());
    }
}
