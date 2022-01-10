import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand1 = rand.nextInt(10);
		System.out.println(rand1);
		int rand2 = rand.nextInt(100)+1;
		System.out.println(rand2);
		double rand3 = rand.nextDouble()+2.5;
		System.out.println(rand3);
		double rand4 = rand.nextInt(576)+14+rand.nextDouble();
		System.out.println(rand4);
	}
}
