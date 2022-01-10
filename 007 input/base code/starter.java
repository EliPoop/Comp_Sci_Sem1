import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("whats your name?");
	String name = sc.nextLine();
	
	System.out.println("how old are you?");
	int age = sc.nextInt();

	System.out.println("what month were you born in?");
	int month = sc.nextInt();
	
	System.out.println("what day were you born?");
	int day = sc.nextInt();
	
	System.out.println("what year were you born?");
	int year = sc.nextInt();
	
	System.out.println("how much is a buck fifty?");
	double buck = sc.nextDouble();

	}
	
}
