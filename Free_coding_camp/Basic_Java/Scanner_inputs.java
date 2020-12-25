package Free_Coding_Camp;

import java.util.Scanner;

public class Scanner_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the input-");
		String scanned=sc.next();

		System.out.println(scanned);
		System.out.print("Enter the input-");
		int scanned_1=sc.nextInt();
		
		System.out.println(scanned_1);
		
		
		System.out.println("Enter the boolean input:");
		boolean scanned_b=sc.nextBoolean();
		System.out.println(scanned_b);
	}

}
