package opps.Abstract;

public class Sqaure extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Square Executed");
	}

	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.draw();
		obj.corners();
	}
}
