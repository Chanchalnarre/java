
public class exceptionDemo {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println(array[-1]); 

        } catch (Exception e) {
            System.out.println("Caught NegativeArrayIndexException: " + e.getMessage());
        }

        try {
            int result = 10 / 0; 

        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}