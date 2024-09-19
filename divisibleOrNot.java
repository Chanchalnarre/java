import java.util.Scanner;
public class divisibleOrNot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to be checked:");
        int number = sc.nextInt();

        System.out.println("Enter the divisor:");
        int divisor = sc.nextInt();
        
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else if (number % divisor == 0) {
            System.out.println(number + " is divisible by " + divisor);
        } else {
            System.out.println(number + " is not divisible by " + divisor);
        }
    }
}
