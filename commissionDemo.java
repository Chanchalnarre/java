import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        if (sales < 0) {
            throw new IllegalArgumentException("Sales cannot be negative");
        }
        this.sales = sales;
    }

    public double commission() {
        // Calculate commission here. For example, let's say the commission is 10% of sales.
        return sales * 0.10;
    }
}

public class commissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sales amount:");
        double sales = scanner.nextDouble();

        try {
            Commission commission = new Commission(sales);
            System.out.println("The commission is: " + commission.commission());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input");
        }
    }
}
