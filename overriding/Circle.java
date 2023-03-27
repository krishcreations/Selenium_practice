package overriding;

public class Circle extends Shape
{
	@Override
	public void draw () {
		System.out.println("Circle is child class method");
	}
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.draw();
		Shape ref  = new Circle();
		ref.draw();
	}

}
