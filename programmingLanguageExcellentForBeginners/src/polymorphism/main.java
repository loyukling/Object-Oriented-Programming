package polymorphism;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deer d = new Deer();
		Animal a = d;
		
	}

}
 class Animal{
	 public void move() {
		 System.out.println("Animals can move");
		 
	 }
	 
 }
 class Deer extends Animal{
	 public void move() {
		 System.out.println("Deer can walk and run");
	 }
	 public void jump() {
		 System.out.println("Jumped");
	 }
	 
 }
 