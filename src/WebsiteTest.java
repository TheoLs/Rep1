import java.util.Scanner;

public class WebsiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner something = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("To continue enter your name");
		System.out.flush();
		System.out.println("Nice to meet you "+something.nextLine());
		System.out.println("It's time to start your adventure");
		
		Scanner fnumber = new Scanner(System.in);
		
		Scanner snumber = new Scanner(System.in);
		
		double answer = 15;
		
		
		here: for(int i = 0; i < 3; i++)
		{
		System.out.println("What two numbers must you combine, to get the result of 15");
		
		double fnum1 = fnumber.nextDouble();
		double snum1 = snumber.nextDouble();
		
		if ((fnum1+snum1)== 15)
		{
			System.out.println("You are smart");
			
			
		}
		else {
			System.out.println("You are not that smart, are you?");
			System.out.println("Try again");
			continue here;
		}
		

		
	}
	}
}
