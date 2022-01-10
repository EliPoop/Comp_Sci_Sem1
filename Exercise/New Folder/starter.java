import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.kjhbguygkygviyugyyiuigiyyigigiiuyvgiguytviuguygiygygigygiuygviuygviuygviyg
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("what number");
		int num= sc.nextInt();
		int times= num - 1;
		int a = 1;
		int c = num;
		while(true){
			c = c-1;
			num = num*(a);
		
			System.out.println(num);
			
			if(times==a){
				break;
			}
			a=a+1;
			}
		}
		
	}

