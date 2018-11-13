package programmingLanguageExcellentForBeginners;

public class Desk {
	String color;
	String material;
	Size3d size = new Size3d(11,25,5);
	
	public Desk(String color , String material , Size3d size) {
		this.color = color;
		this.material= material;
		this.size=size;
	}
	public static void main(String[] args) {
		Desk myDesk = new Desk("Brown" , "Wood" , new Size3d(11,25,5));
		System.out.println("My Desk length is " + myDesk.size.height);
		
		Size3d sz = new Size3d(1,2,3);
		System.out.println (sz instanceof Size2d); //instanceof:  type comparison operator because it compares the instance with type. It returns either true or false
	}
}
class Size3d extends Size2d{
	
	int height;
	
	public Size3d(int height , int width , int length) {
		super(width,length);
		this.height = height;
		
	}
	
	
}

class Size2d{
	int length;
	int width;
	
	public Size2d(int width, int length) {
		this.width=width;
		this.length = length;
				
	}
	
}