package facade;

public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	private int num;

	public void shapeMaker() 
{
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
		throw new UnsupportedOperationException();
	}

	public void drawCircle() {
		circle.draw();
		throw new UnsupportedOperationException();
	}

	public void drawRectangle() {
		rectangle.draw();
		throw new UnsupportedOperationException();
	}

	public void drawSquare() {
		square.draw();
		throw new UnsupportedOperationException();
	}

}
