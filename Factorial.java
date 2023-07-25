
import java.util.Scanner;

public class Factorial {

		public static void main(String args[]) {
			try(Scanner sc = new Scanner(System.in))
			{
				int i, fact = 1;
				System.out.println("enter a number to find its factorial");
				int number =  sc.nextInt();
						for (i = 1; i <= number; i++) {
							fact = fact * i;
						}
				System.out.println("Factorial of " + number + " is: " + fact);
				
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	
}
