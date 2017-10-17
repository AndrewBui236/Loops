import java.util.Random;
import java.util.Scanner;

public class TimeTableChallenge {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();
		//Setup Variables
		int hi;
		int low;
		int num;
		int score=0;
		int hi2=0;
		int x=1;
		//Ask for hi, low and num
		System.out.println("Welcome to the Time Table Challenge!");
		System.out.println("What is the bigest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		if (low>hi) {
			hi=low;
			low=hi2;
		}
		//Loop and ask questions
		
		while (score<10) {
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			System.out.println("Question "+x+") "+num1+" x "+num2+" = ?");
			int ans=in.nextInt();
			if (ans==num1*num2) {
				score++;
				System.out.println("Right");
			}else {
				System.out.println("Wrong! The answer is "+(num1*num2));
				score=0;
				System.out.println("Try until you get 10 right in a row");
			}
			x++;
			}
		
		//Print results
		System.out.println("You got "+score+" right in a row");
	}
}
