package ava2019;

class Ball {
	public String name;
	public static String description;

	public void showName() {
		System.out.println(name);
	}
	
	public static void showInfo() {
		System.out.println(description);
	}
}

public class StaticAndFinalex {

	public static void main(String[] args) {

		Ball.description = "Jabulani was used in 2014 world cup";
        Ball.showInfo();
        
		Ball ball1 = new Ball();
		Ball ball2 = new Ball();
		Ball ball3 = new Ball();

		ball1.name = "Jabulani";
		ball2.name = "Nike";
		ball3.name = "adidas";

		ball1.showName();
		ball2.showName();
		ball3.showName();

		/*
		 * System.out.println(ball1.name); System.out.println(ball2.name);
		 * System.out.println(ball3.name);
		 **/

	}

}
