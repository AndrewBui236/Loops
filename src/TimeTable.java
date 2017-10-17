import java.util.Scanner;
import java.util.Random;

public class TimeTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		int hi;
		int low;
		int num;
		int hi2=0;
		//Ask for hi and low
		System.out.println("Welcome to your times table.");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		if (low>hi) {
			hi2=hi;
			hi=low;
			low=hi2;
			System.out.println("Switched it around.");
		}
		//Loop
		System.out.print("\t");
		for (int x=low;x<=hi;x++) {
			System.out.print(x+"\t");
		}
		System.out.print("\n");
		for (int y=low;y<=hi;y++) {	
			System.out.print(y+"\t");
			for	(int x=low;x<=hi;x++) {
				System.out.print(x*y+"\t");
			}
			System.out.println();
		}
	}

}