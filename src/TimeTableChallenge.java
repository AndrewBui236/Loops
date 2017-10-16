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

		//Ask for hi, low and num
		System.out.println("Wekcome to the Time Table Challenge!");
		System.out.println("What is the bigest number you want?");
		hi=in.nextInt();
		System.out.println("what is the smallest number you want?");
		low=in.nextInt();
		System.out.println("How many questions do you want?");
		num=in.nextInt();
		//loop and ask questions
		for (int x=1;x<=num;x++) {
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			System.out.println("Question "+x+") "+num1+" x "+num2+" = ?");
			int ans=in.nextInt();
			if (ans==num1*num2) {
				score++;
				System.out.println("Right");
			}else {
				System.out.println("Wrong! The answer is "+(num1*num2));
			}
		}
		//Print results
		System.out.println("You got "+score+" right out of "+num);
	}
}
