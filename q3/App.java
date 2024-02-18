import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Visitor raster = new RasterMethod();
		Visitor vector = new VectorMethod();

		Shape shapesCircle = new Circle(5.5, 200, 100);
		Shape shapesTriangle = new Triangle(4,5, 500, 1000);
		Shape shapesRectangle = new Rectangle(6,8, 400, 720);
			
		shapesCircle.accept(vector);
		shapesTriangle.accept(vector);
		shapesRectangle.accept(vector);

		shapesCircle.accept(raster);
		shapesTriangle.accept(raster);
		shapesRectangle.accept(raster);
	}
}
