import java.util.Scanner;
import java.util.Random;

public class TimeTableChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi;
		int low;
		int num;
		int ques=1;
		int score=0;

		//Ask for hi low and num
		System.out.println("Welcome to the times table challenge!");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		if (low>hi) {
			hi=low*4;
			System.out.println("Since you don't what numbers are bigger than others, your new biggest number is "+hi+"");
		}
		//Loop and ask questions
		while (score<10) {
			int num1=rnd.nextInt(hi-low+1)+low;
			int num2=rnd.nextInt(hi-low+1)+low;
			System.out.println("Question "+ques+") "+num1+" x "+num2+" =?");
			int ans=in.nextInt();
			if (ans==num1*num2) {
				score++;
				System.out.println("I dare you to get one wrong.");
			}else {
				score=0;
				System.out.println("Keep trying!");
			}
			ques++;
		}

		//Print results
		System.out.println("You have no more questions");
	}
}