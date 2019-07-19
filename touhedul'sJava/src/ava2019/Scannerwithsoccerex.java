package ava2019;

import java.util.Scanner;

public class Scannerwithsoccerex {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the command:");
		String text = input.nextLine();
		switch (text) {
		case "seven":
			System.out.println("Jersey number for Cristiano ronaldo");
			break;
		case "ten":
			System.out.println("jersey number for Lionel messi");
			break;
		case "four":
			System.out.println("jersey number for Sergio ramos");
			break;
		case "nine":
			System.out.println("jersey number for Paul scholes");
			break;
		case "eighT":
			System.out.println("jersey number for Andres iNesta");
        default:
        	System.out.println("all other players are suck");
		}
	}
}
