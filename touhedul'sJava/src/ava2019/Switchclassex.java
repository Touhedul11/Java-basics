package ava2019;

import java.util.Scanner;

public class Switchclassex {
	public static void main(String[] args) {

		Scanner put = new Scanner(System.in);
		System.out.println("Enter a command");

		String text = put.nextLine();
		switch (text) {
		case "stop":
			System.out.println("Car stopped");
			break;
		case "start":
			System.out.println("car has started");
			break;
			
			default:
				
			System.out.println("car will remain same");

		}
	}
}
