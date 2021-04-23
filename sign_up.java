package ERP;
import java.util.Scanner;

public class sign_up {
	public static void mai1n(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Employee ID");
		String employeeID = in.nextLine();
		
		System.out.println("Employee SSN");
		String employeeSSN = in.nextLine();
		
		System.out.println("Job Title");
		String jobTitle = in.nextLine();
		
		System.out.println("Enter First Name");
		String firstName = in.nextLine();
		
		System.out.println("Enter Last Name");
		String lastName = in.nextLine();
		
		System.out.println("Enter Salary Type");
		String salaryType = in.nextLine();
		
		System.out.println("Bonus");
		Double bonus = in.nextDouble();
		
		System.out.println("Insurance Benefits");
		String insuranceBenefits = in.nextLine();
		
		System.out.println("Premium Individual Cost");
		Double premiumIndividualCost = in.nextDouble();
		
		System.out.println("Premium Family Cost");
		Double premiumFamilyCost = in.nextDouble();
	}
	
	

}
