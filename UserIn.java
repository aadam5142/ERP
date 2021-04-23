package ERP;
import java.util.Scanner;

class UserIn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Username: ");
		//System.out.println();
		String userName = in.nextLine();
		System.out.print("Enter Password: ");
		//System.out.println();
		String password = in.nextLine();
		boolean sentinel = true;
		System.out.println("Welcome " + userName);
		while (sentinel) {
			userPrompt();
		}

	}

	private static void userPrompt() {
		Scanner in = new Scanner(System.in);
		System.out.print("------------------------------------------------------------------------\n");
		System.out.print("(V)iew Reports, (U)pdate Information,  (A)dd Employee: ");
		String userInput = in.nextLine();
		System.out.println("------------------------------------------------------------------------");
		if (userInput.equals("V")) {
			viewReport();
		} else if (userInput.equals("U")) {
			updateInformation();
		} else if (userInput.equals("A")) {
			addEmployee();
		} else {
			userPrompt();
		}
	}

	private static void addEmployee() {
		Scanner in = new Scanner(System.in);
		System.out.print("Employee ID: ");
		String employeeID = in.nextLine();

		System.out.print("Employee SSN: ");
		String employeeSSN = in.nextLine();

		System.out.print("Job Title: ");
		String jobTitle = in.nextLine();

		System.out.print("Enter First Name: ");
		String firstName = in.nextLine();

		System.out.print("Enter Last Name: ");
		String lastName = in.nextLine();

		System.out.print("Enter Salary Type: ");
		String salaryType = in.nextLine();

		System.out.print("Bonus: ");
		Double bonus = in.nextDouble();
		in.nextLine();

		System.out.print("Insurance Benefits: ");
		String insuranceBenefits = in.nextLine();

		System.out.print("Premium Individual Cost: ");
		Double premiumIndividualCost = in.nextDouble();

		System.out.print("Premium Family Cost: ");
		Double premiumFamilyCost = in.nextDouble();

	}

	private static void updateInformation() {
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to update?");
		System.out.print("(B)enefits, (E)mployee Information, 401K (C)ontribution, (A)dd Depedents, Change (T)axes, (R)edefine Bonuses, (M)ain Menu: ");
		String userInput = in.nextLine();
		if (userInput.equals("B")) {
			System.out.println("Which Benefits would you like to update?");
			System.out.print("401K (C)ontribution, Attorney (P)lan, (L)ife Insurance, (H)ealth Plan: ");
			userInput = in.nextLine();
			if(userInput.equals("C")) {
				System.out.print("What should the new value of the 401K Contribution be?: ");
				userInput = in.nextLine();
			}else if(userInput.equals("P")) {
				System.out.print("What is the new Attorney Plan?: ");
				userInput = in.nextLine();
			}else if(userInput.equals("L")) {
				System.out.print("What is the new Life Insurance Plan?: ");
				userInput = in.nextLine();
			}else if(userInput.equals("H")) {
				System.out.print("What is the new Health Plan?: ");
				userInput = in.nextLine();
			}
		} else if (userInput.equals("E")) {
			System.out.println("Which Employee Information would you like to update?");
		} else if (userInput.equals("C")) {
			System.out.println("What value would you like to set as the new 401K contribution?");
		} else if (userInput.equals("A")) {
			System.out.println("What is the Dependent's first name?");
			System.out.println("Waht is the Dependent's last name?");
			System.out.println("What is the Dependent's SSN?");
			System.out.println("What is the EmployeeID who represents Dependent?");
			System.out.println("What is the relation between Employee and Dependent?");
			System.out.println("What health benefits are being shared from Employee to Dependent, if any?");
		} else if (userInput.equals("T")) {
			System.out.println("Would you like to alter (S)tate tax or (F)ederal Tax?");
			if (userInput.equals("S")) {
				System.out.println("What should be the new value for State Tax?");
			} else if (userInput.equals("F")) {
				System.out.println("What should be the new value for Federal Tax?");
			}
		} else if (userInput.equals("R")) {
			System.out.println("What should be the Employee's new bonus value?");
		}

	}

	private static void viewReport() {
		Scanner in = new Scanner(System.in);
		String userInput = in.nextLine();
		System.out.println("Which report would you like to view?");
		System.out.println("(P)aycheck, (W)2, (C)ompany Report");
		if(userInput.equals("P")) {
		/*
		 * Need to return
		 * employeeID
		 * employeeSSN
		 * Income
		 * Tax Deductions
		 * 401K Deduction
		 * Insurance Premium
		 */
		}else if(userInput.equals("W")) {
		/*
		 * employeeID
		 * employeeSSN
		 * yearlyIncome
		 * Deductions
		 * Bonuses
		 */
		}else if(userInput.equals("C")) {
		/*
		 * Wages
		 * Bonuses
		 * 401K Contributions (Matching)
		 * EmployerSSNContribution
		 * EmployerInsuranceContribution
		 */
		}
	}
}

