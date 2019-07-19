package ava2019;

class Soccer {
	String name;
	int age;
	int numg;
	String nickname;
	String strongfoot;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public int getNumberOfGoals() {
		return numg;
		
	}
	public String getNickname() {
		return nickname;
	}
	public String stronfoot() {
		return strongfoot;
	}
}

public class ThisAndSettersex {
	public static void main(String[] args) {
     Soccer player7= new Soccer();
    		 player7.name = "Cristiano Roanldo";
             player7.age = 33;
             player7.numg = 701;
             player7.nickname = "Machine Man";
             player7.strongfoot = "Right foot";
             
             System.out.println(player7.name);
             System.out.println(player7.age);
             System.out.println(player7.numg);
             System.out.println(player7.nickname);
             System.out.println(player7.strongfoot);
	}
}
