package facade;

public class Square implements Shape
{

	public void draw() {
		System.out.println("Drawing Square!");
		throw new UnsupportedOperationException();
	}

}
