public class sumAndAverage{
    public static void main(String[] args) {
        int[] numbers = {5,2,7,9,5,}; 
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}

