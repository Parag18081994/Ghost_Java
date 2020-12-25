package Free_Coding_Camp;

import java.util.Scanner;

public class if_else_stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String s=sc.next();
		
		if (s.equals("tim")) 
				{
					System.out.println("You type tim");
				}
		
		else if(s.equals("Hello")){
			
			System.out.println("Hello else_if block");
		}
		
else if(s.equals("Hi")){
			
			System.out.println("Hi else_if block");
		}
		
		else
		{
			System.out.println("Your input is not tim");
		}

	}

}
