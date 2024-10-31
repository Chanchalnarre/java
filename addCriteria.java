import java.util.Scanner;

public class addCriteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks for student " + i + " (Mathematics, Physics, Chemistry):");
            int maths = scanner.nextInt();
            int physics = scanner.nextInt();
            int chemistry = scanner.nextInt();

            if (isEligible(maths, physics, chemistry)) {
                System.out.println("Student " + i + " is eligible.");
            } else {
                System.out.println("Student " + i + " is not eligible.");
            }
        }
    }

    public static boolean isEligible(int maths, int physics, int chemistry) {
        int total = maths + physics + chemistry;
        int mathsPhysicsTotal = maths + physics;

        return (maths >= 60 && physics >= 50 && chemistry >= 40 && 
                (total >= 200 || mathsPhysicsTotal >= 150));
    }
}

