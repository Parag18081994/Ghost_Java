package Free_Coding_Camp;

import java.util.Scanner;

public class Nessted_stat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age=sc.nextInt();
		System.out.println(age);
		
		if (age>=18)
		{
			//System.out.println("You are adult "+age +" and allowed in the ride");
			System.out.println("enter your favourite food:");
			String food= sc.next();
			System.out.println(food);
			
			if (food.equals("pizza"))
			{
				System.out.println("Mine too");
			}
				
			else
			{
				System.out.println("Mine not");
			}
		}
		else if (age>=13)
		{
			System.out.println("You are a tennager");
		}
		
			else 
		{
			System.out.println("You are not allowed in the age,you are less than 16");
		}
		

	}

}
