package facade;

public class FacadePattern {

	public static void main(String[] args)
	{
		shapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		throw new UnsupportedOperationException();
	}

}
