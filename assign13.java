import java.util.Scanner;
public class assign13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else {
             System.out.println(number + " is zero.");
                }
            }
        }