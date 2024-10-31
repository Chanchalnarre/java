import java.util.Scanner;

public class dulEleFrequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int[] frequency = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (frequency[i] == 0) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        frequency[j] = -1; 
                    }
                }
                if (count > 1) {
                    frequency[i] = count;
                }
            }
        }

        System.out.println("Duplicate elements and their frequencies:");
        for (int i = 0; i < n; i++) {
            if (frequency[i] > 1) {
                System.out.println("Element: " + array[i] + ", Frequency: " + frequency[i]);
            }
        }
    }
}
