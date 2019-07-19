package ava2019;

public class Arrayfirstlessonex {
public static void main(String[] args) {
	 
	int [] values;
	values = new int[7];
	values [2] = 10;
	values [3] = 20;
	values [4] = 30;
	
	System.out.println(values[2]);
	System.out.println(values[3]);
	System.out.println(values[4]);
	
	for (int i = 0; i <values.length; i++)
	{
		System.out.println(values[i]);
	}
}
}
