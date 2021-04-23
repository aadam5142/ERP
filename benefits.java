package ERP;
import java.util.Scanner;

public class benefits {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("401K Contributions");
		String contributions = in.nextLine();
		
		System.out.println("Attoney Plan");
		String attorneyPlan = in.nextLine();
		
		System.out.println("Employee ID");
		int employeeID = in.nextInt();
		
		System.out.println("Life Insurance");
		String lifeInsurance = in.nextLine();
		
		System.out.println("Health Plan");
		String healthInsurance = in.nextLine();
		
	}

}
