package ava2019;

import java.util.Scanner;

public class Dowhileloopwthscanner {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int value = 0;
	
	do {
		System.out.println("Enter the number you want to:");
		value = scanner.nextInt();
	}
	
	while (value!=8);
	System.out.println("got 8");
	
}
}
