import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
	Scanner sc=new Scanner(System.in);
	System.out.println("type one integer");
	
	int x = sc.nextInt();
	System.out.println("type another integer");
	int y = sc.nextInt();
	boolean z = x != y ;
	boolean g = x ==y;
	if(z)
	{
		System.out.println("x and y are different");
	}
	
	if(g)
	{
		System.out.println("x and y are the same");	
	}
	
	}
}
