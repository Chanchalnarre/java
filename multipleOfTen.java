import java.util.Scanner;

public class multipleOfTen{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the start of the interval:");
        int start = sc.nextInt();

        System.out.println("Enter the end of the interval:");
        int end = sc.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}

