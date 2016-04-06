
import java.util.*;
public class ShapeStacker {

	public static void main(String[] args) {
		
		
		//create a variable for diameter, square side, rectangle width and length, and 3 triangle sides
		double diameter;
		
		double sideOfSquare;
		
		double length;
		double width;
		
		double side1;
		double side2and3;
		
		
		//create scanner object for user input
		Scanner reader = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Enter a number for the diameter of a circle: ");
		diameter = reader.nextDouble();
		
		System.out.println("Enter a number for side of a square: ");
		sideOfSquare = reader.nextDouble();
		
		System.out.println("Enter a number for width of a rectangle: ");
		width = reader.nextDouble();
		
		System.out.println("Enter a number for length of a rectangle: ");
		length = reader.nextDouble();
		
		System.out.println("Enter a number for side 1 of a triangle:  ");
		side1 = reader.nextDouble();
		
		System.out.println("Enter a number for side 2 and 3 of a triangle:  ");
		side2and3 = reader.nextDouble();
		
		reader.nextLine();
		
		//create objects of different shapes
		Circle circle1 = new Circle(diameter);
		Square square1 = new Square(sideOfSquare);
		Rectangle rectangle1 = new Rectangle(width, length);
		Triangle triangle1 = new Triangle(side1, side2and3);
		
		//display output
		System.out.println("The area of the circle is: " + circle1.calculateArea(diameter));
		System.out.println("------------------");
		System.out.println("The area of the square is: " + square1.calculateArea(sideOfSquare));
		System.out.println("------------------");
		System.out.println("The area of the rectangle is: " + rectangle1.calculateArea(width, length));
		System.out.println("------------------");
		System.out.println("The perimeter of the triangle is: " + triangle1.calculatePerimeterTriangle(side1, side2and3));
		
		
		

	}

}
