public class methodOver{
    
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        methodOver calculator = new methodOver();

        int sum1 = calculator.add(5, 10); 
        int sum2 = calculator.add(5, 10, 15); 
        double sum3 = calculator.add(5.5, 10.5); 

        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 5, 10, and 15: " + sum2);
        System.out.println("Sum of 5.5 and 10.5: " + sum3);
    }
}
