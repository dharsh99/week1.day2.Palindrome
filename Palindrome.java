package week1.day2;

import java.util.Scanner;

public class Palindrome {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number");
		int n = scanner.nextInt();
		
		int input = n;
		int output = 0;
		
	for(int i = n;i!=0;i/=10)
	{
		int value = i%10;
		output = output*10+value;
	}

	if(input==output)
	{
		System.out.println("It is  palindrome "+input);
	}
	else
	{
		System.out.println("It is not palindrome " +input);
	}
	
	}

}
