import java.util.Scanner;

public class naturalNumSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range:");
        int range = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= range; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
