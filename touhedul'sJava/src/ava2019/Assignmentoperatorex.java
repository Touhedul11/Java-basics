package ava2019;

public class Assignmentoperatorex {
public static void main(String[] args) {
	int a = 10;
	int b = 4;
	int c = 1;
	
	c = a+b;
    System.out.println(c);  /* equal sign means is just same for regular math*/
    
    c+= a ;
    System.out.println(+c); /* ADD-AND operator is used for adding right hand value 
                            to the left hand value which is inside of method. Then it 
                            makes a new value */ 
    
    c-= a;
    System.out.println(+c); /* SUBTRACT-AND operator is used for subtracting right hand 
                             operator from left hand operator */
    
    c *= a;
    System.out.println(+c); /* it multiplies each other value and and the old value
                             to the past c*/
    c/= a;
    System.out.println(+c);
    
    c%=a;
    System.out.println(+c);
    
    c<<=2;
    System.out.println(+c);
    
    c>>=2;
    System.out.println(+c);
    
    c &=2;
    System.out.println(+c);
    
    c^=2;
    System.out.println(+c);
    
    c|=2;
    System.out.println(+c);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
}
