import java.util.Scanner;

public class TestingGrounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// When data is located on the same location, the computer access then much faster than
		// when the data is located in different locations from each other
		// Linear data structure is accessed quicker(Array, ArrayList, List, Queue, Stack and etc.)
		// Non-linear data structure.
		
		/* An Array is a data structure which can store a fixed-size collection of elements ( starting from 0 as the first variable).
		 * that are the same data type (int, boolean). It's stored in a linear order and the length is set and cannot be changed.
		 */
		
		//Declare Array :  int[] myArray; 	*type and name of the Array
		//Define Array : myArray = new int[20]  * 20 is the length
		// Declare and Define : int[]myArray= new int[20];
		
		Scanner sc = new Scanner(System.in);
		
		double[] DArray = new double[5];
		
		
		DArray[0]=6.75;
		DArray[1]=1.5;
		DArray[2]=5.6;
		DArray[3]=7.2;
		DArray[4]=9.4;
		
		double i = DArray[4];
		
		System.out.println(DArray[0]);
		
		long[] mybigboyNumbers = new long[20];
		mybigboyNumbers[19] = 33;
		
		char[] grades = new char[5];
		
		grades[0]= 'A';
		grades[1]= 'B';
		grades[2]= 'A';
		grades[3]= 'A';
		grades[4]= 'B';
		
		char cs1001 = grades[0];
		char cs1005 = grades[4];
		
		System.out.println(cs1001);
		System.out.println(cs1005);
		
		
		String[] Input = sc.nextLine().split("/");
		
		int x = Integer.parseInt(Input[0]);
		int y = Integer.parseInt(Input[1]);
		
		System.out.println(x+y);
		
	
	}

}
