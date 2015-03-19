package facade;

public class Rectangle implements Shape
{

	public void draw() 
	{
		System.out.println("Drawing Rectangle!");
		throw new UnsupportedOperationException();
	}

}
