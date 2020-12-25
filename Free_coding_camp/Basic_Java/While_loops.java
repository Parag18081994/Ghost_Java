package Free_Coding_Camp;

import java.util.Scanner;

public class While_loops {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		int x=sc.nextInt();
		
		int count=0;
		while (x!=10)
		{
			
			System.out.println("Type 10...");
			System.out.print("Type a number:");
			x=sc.nextInt();
			count++;
		}
		System.out.println("Number found");
		System.out.print("You tried:"+count+" after times");
		
	}

}
