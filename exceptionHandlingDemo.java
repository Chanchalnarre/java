import java.io.IOException;

public class exceptionHandlingDemo {

    public static void riskyMethod() throws IOException {
        throw new IOException("IO Exception thrown from riskyMethod");
    }

    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 3: " + numbers[3]); 

            riskyMethod();
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
        finally {
            System.out.println("This is the finally block.");
        }

        try {
            throw new IllegalArgumentException("Manually thrown IllegalArgumentException");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block after manually thrown exception.");
        }
    }
}