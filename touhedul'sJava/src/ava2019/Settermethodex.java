package ava2019;

class Robot{
	
	public void speak (String text) {
		System.out.println(text);
	}
	
	public void jump (int height) {
		System.out.println(height);
	}
	public void move (String direction, String moves, double distance, int num){
		System.out.println("moving "+ direction+ "towards"+ moves+ 
		"amount of "+ distance+ "while counting"+ num);
}

}






public class Settermethodex {

	public static void main(String[] args) {
		
		Robot cena = new Robot();
		cena.speak("Never Give up");
		
		cena.jump(7 );
		cena.move("east", "right", 12.2, 3);
		
		

	}

}
