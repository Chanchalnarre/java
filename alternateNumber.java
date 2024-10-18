public class alternateNumber{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 

        System.out.println("Alternate numbers in the array:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.println(numbers[i]);
        }
    }
}
