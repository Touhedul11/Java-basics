package ava2019;

import java.util.Scanner;

import com.sun.jdi.VoidValue;

public class Scannerex {
public static void main(String[] args) {
	// this method menas creating a new object
	Scanner input = new Scanner(System.in);
	// this command means creating a prompt question  in the compiler
	System.out.println("Enter your date of birth");
	// this means assigning a variable type
	int value = input.nextInt();

	 // this means repeating the users input in the previous method where i assign value variable 
	System.out.println("You entered:" + value);
	
	if (value>30)
	{
		System.out.println("send him to the europe");
	}
	else if (value<28) {
		System.out.println("bring him to the Usa");
	}
	
	else {
		System.out.println("send him to the moon");
	}
}
}
