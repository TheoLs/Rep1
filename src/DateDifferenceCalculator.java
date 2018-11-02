import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class DateDifferenceCalculator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		// Capture user input
		//System.out.println("Input format is DD/MM/YYYY");

		//System.out.print("Insert first date: ");
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		// Calculation part
		
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
		String inputString1 = scan.nextLine();
		
		System.out.print("Insert second date: ");
		String inputString2 = scan2.nextLine();
		scan.close();
		scan2.close();
	
		//Day 1 Input
		int day;
		int month;
		int year;
		System.out.println("Input the first date in a DD/MM/YYYY");
		String[] array1 = scan.nextLine().split("/");
		day 	= Integer.parseInt(array1[0]);
		month	= Integer.parseInt(array1[1]);
		year	= Integer.parseInt(array1[2]);
		
		
		//Day 2 Input
		int day2;
		int month2;
		int year2;
		System.out.println("Input the second date in the same format");
		String[] array2 = scan2.nextLine().split("/");
		day2 	= Integer.parseInt(array2[0]);
		month2	= Integer.parseInt(array2[1]);
		year2	= Integer.parseInt(array2[2]);
		
		year = (year +(year / 4)) %7;
		year2 = (year2 +(year2 / 4)) %7;
		//033614625035
		//month = 
		
		//Date date1 = new Date();
		
		
		//System.out.println(day2);
		
		//month = month / 30;
		
		
		
		

		/*try 
		{
			Date date1 = myFormat.parse(inputString1);
			Date date2 = myFormat.parse(inputString2);
			long diff = date2.getTime() - date1.getTime();
			System.out.println("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) 
		{
			e.printStackTrace();
		}
		*/
		
	}

}
