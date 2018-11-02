import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner bucky = new Scanner(System.in);
				double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = bucky.nextDouble();
		System.out.println("Enter second number: ");
		snum = bucky.nextDouble();
		
		answer = fnum + snum;
		System.out.println("");
		System.out.println(answer);
		
		int heartrate;
		int pressure;
		String dizziness;
		
		System.out.println("Heart rate");
		heartrate = bucky.nextInt();
		System.out.println("Blood Pressure");
		pressure = bucky.nextInt();
		System.out.println("Are you feeling dizzy?");
		dizziness = bucky.nextLine();
		
		
		if ((heartrate >90) && (pressure>20) && (dizziness == "yes")) {
			System.out.println("Call an ambulance");
		}
	}
}