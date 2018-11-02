
public class LoopTestingGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//for (<var> = <start>; <continue condition> ; <incremenet>
// var i the name of any single variable. start is an initial starting value for the loop variable
		
		//Example ForLoop 
		for (int i = 1; i<=4; i++) 
			//x-- is equal to x = x + 1 (Same for x-- = x = x - 1)
		{
			System.out.println("Count is: " + i);
		}
		
		int x=1;
		System.out.println(x++);
		x=1;
		System.out.println(++x);
		
		int n=10;
		int i;
		for(i=0;i<=n;i=i+3) {
			System.out.println(i);
		}
		System.out.println(i);
		
		//Loops and conditionals
		for(int y=0; y<= 20;y++) {
			if(y%2==0) {
				System.out.println(y);
			}
		
			else {
				System.out.println("Fixed it");
				break;
			}
		}
			
		//While Loops
		int z=1; while (z<6)  					//Step1 Continue Condition= while ()
		{
			System.out.println("Count is : "+z); //Step2 Statement
			z++;								//Step3 If the increment is not included, then this loop will run forever.
		}
		
		//Do-While Loops will execute at least once no matter what because the code comes before the while condition.
		int f=2;
		do
		{
			System.out.println("Count is now: "+f);
			f=f+2;
		} while(f<=6);
		
		System.out.println("Heyyy you got a problem");
		//Loop inside a loop = Nested Loops
		for(int l=1; l<=3;l++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.println(l+j);
			}
		}
		
		
	}
}

