import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("pick a number 1 through 1000");
	int x = sc.nextInt();
	Random rand = new Random();
  int z = rand.nextInt(1001);
if(x==z)
{
	System.out.println("correct");
}
else if(x!=z)
{
	System.out.println("wrong answer");
	System.out.println("the right answer is " + z);
}
	}
}
