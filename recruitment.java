import java.util.Scanner;

class TooOlder extends Exception{
    public TooOlder(String message) {
        super(message);
    }
}

class TooYounger extends Exception {
    public TooYounger(String message) {
        super(message);
    }
}

public class recruitment{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter candidate name:");
        String name = scanner.nextLine();

        System.out.println("Enter candidate age:");
        int age = scanner.nextInt();

        try {
            checkEligibility(name, age);
        } catch (TooOlder | TooYounger e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEligibility(String name, int age) throws TooOlder, TooYounger {
        if (age > 45) {
            throw new TooOlder("TooOlder");
        } else if (age < 20) {
            throw new TooYounger("TooYounger");
        } else {
            System.out.println("Eligible");
            System.out.println("Candidate Name: " + name);
        }
    }
}
