import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class ShapeStackerTest {

	@Test
	public void test_Circle() {
		//given
		Circle circle1 = new Circle(4);
		
		//test
		Assert.assertEquals(4, circle1.getDiameter(), 0);
	}
	
	@Test
	public void test_Square() {
		//given
		Square square1 = new Square(4);
		
		//test
		Assert.assertEquals(4, square1.getSide(), 0);
	}
	
	@Test
	public void test_Rectangle() {
		//given
		Rectangle rectangle1 = new Rectangle(4,10);
		double perimeter = rectangle1.calculatePerimeter(4, 10);
		//test
		Assert.assertEquals(perimeter, 28, 0);
			
	}
	
	@Test
	public void test_Triangle() {
		//given
		Triangle triangle1 = new Triangle(20, 22);
		double trianglePerimeter = triangle1.calculatePerimeterTriangle(20, 22);
		
		//test
		Assert.assertEquals(trianglePerimeter, 64, 0);
			
	}
	
}
