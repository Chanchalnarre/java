import java.util.Scanner;
public class assign12 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
		double celsius = sc.nextDouble();
		// formula for conversion 
		
        double fahrenheit = (celsius * 1.8) + 32; 
		System.out.println("The temperature in fahrenheit is: " + fahrenheit);
	} 
}