import java.util.Scanner;
public class assign16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in miles:");
        double miles = sc.nextDouble();

        double kilometers = miles * 1.609;
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
    }
}
