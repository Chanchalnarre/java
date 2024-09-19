import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        int i = 1;
        while(i<=n){
        int sum = a + b;
        System.out.print(sum + " ");
        a = b; 
        b = sum;
        i++;
        }
    }
}
