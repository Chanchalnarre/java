import java.util.Arrays;
import java.util.Scanner;

public class findMedian{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        double median = findMedian(numbers);
        System.out.println("The median is: " + median);
    }

    public static double findMedian(int[] numbers) {
        Arrays.sort(numbers);

        if (numbers.length % 2 == 0) {
            // Even number of elements - return the average of the two middle elements
            return (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            // Odd number of elements - return the middle element
            return numbers[numbers.length / 2];
        }
    }
}
