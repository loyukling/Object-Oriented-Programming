package polymorphism;

abstract class Employee{
	abstract void printClassName();
	
}

class Mechanic extends Employee{
	@Override
	void printClassName() {
		System.out.println("Mechanic");
		
	}
	
}