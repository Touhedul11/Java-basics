package ava2019;
class Baseball{
	private String name;
	private int num;
	// cosnstructor has to have the same name as the class name
	// constructor may contain the private method 
 public Baseball(){
	System.out.println("baseball was thrown at 90 mph speed");
}
 public Baseball(String name) {
	 System.out.println("second baseball was thrown at a 90 mph speed towards swinger ");
      this.name = name;
 }
 public Baseball(String name, int num) {
	 System.out.println("Third baseball was thrown at 95 speed mph hour");
      this.name = name;
      this.num = num;
      }
 
}
public class ConstructorEx {

	public static void main(String[] args) {


Baseball baseball1 = new Baseball();
Baseball baseball2 = new Baseball("jonathon");

Baseball baseball3 = new Baseball("rabbit", 7);

	}

}
