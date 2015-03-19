package facade;

public class Circle implements Shape
{

	public void draw() {
		System.out.println("Drawing Circle!");
		throw new UnsupportedOperationException();
	}

}
