import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        int count = 0;
        int temp = number;

        if (temp < 0) {
            temp = -temp;
        }
        if (temp == 0) {
            count = 1; 
        } else {
            while (temp != 0) {
                temp /= 10;
                count++;
            }
        }
        System.out.println("The number of digits in " + number + " is: " + count);
    }
}
