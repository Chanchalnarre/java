public class factorial12 {
    public static void main(String[] args) {
        int num = 12;
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact = fact * i;
        }
        System.out.print("The factorial of 12 is: " + fact);
    }
}
