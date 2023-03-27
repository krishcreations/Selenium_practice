package overriding;

public class Square  extends  Shape
{

	public void draw() {
		System.out.println("square class method");
	}
	
	public static void main(String[] args) {
		Square obj = new Square();
		obj.draw();
		Shape ref = new Shape();
		ref.draw();
	}
}
