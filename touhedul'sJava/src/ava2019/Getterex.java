package ava2019;

class Person {
	int age;
	String name;

	void speak() {
		System.out.println("my name is:" + name);
	}

	int calculateYearsToRetire() {
		int yearsLeft = 65 - age;
		return yearsLeft;
	}

	int getAge() {
		return age;
	}
	String getName() {
		return name;
	}
}

public class Getterex {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "john";
		person1.age = 33;

		person1.speak();
		int caluculateYearsToRetire= person1.calculateYearsToRetire();

		int age = person1.getAge();
	    String name = person1.getName();

		System.out.println("my age is:" + age);
		System.out.println("my name is:"+ name);
		System.out.println(caluculateYearsToRetire);
	}

}
