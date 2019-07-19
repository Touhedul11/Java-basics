package ava2019;

class Player {

	String name;
	int age;
	int numberofgoals;
	String nickname;
	String nationality;
	String strongfoot;
	String weakfoot;

	void description() {
		System.out.println("his name is" + name + "his age is" + age + "and he scored" + numberofgoals
				+ " in his lifetime so far ");
	}
	
	void analogy() {
		System.out.println("His nickname is" + nickname );
	}

}

public class ClassEx {
	public static void main(String[] args) {
		Player player1 = new Player();
		player1.name = "Cristiano Ronaldo";
		player1.age = 33;
		player1.numberofgoals = 700;
		player1.nickname = "Machine man";
		player1.nationality = "Portugueese";
		player1.strongfoot = "Right";
		player1.weakfoot = "left";
        player1.description();
        player1.analogy();
        
		System.out.println("Name is:" + player1.name);
		System.out.println(player1.age);
		System.out.println(player1.numberofgoals);
		System.out.println(player1.nickname);
		System.out.println(player1.nationality);
		System.out.println(player1.strongfoot);
		System.out.println(player1.weakfoot);

	}
}
