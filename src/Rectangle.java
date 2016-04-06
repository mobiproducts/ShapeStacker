
public class Rectangle {
	//private fields
	private double width;
	private double length;
	private double rectanglePerimeter;
	private double area;
		
	//constructor
	public Rectangle(double w, double l){
		width = w;
		length = l;
	}
	
	//methods
	
	//getter and setter width and length of rectangle from user
	public void setWidth(double w){
		width = w;
	}
	public double getWidth(){
		return width;
	}
	
	public void setLength(double l){
		length = l;
	}
	public double getLength(){
		return length;
	}
	
	//calculate the perimeter of a rectangle
	public double calculatePerimeter(double w, double l){
		rectanglePerimeter = 2 * w + 2 * l;
		return rectanglePerimeter;
	}
	
	//calculate area method passing in user input side and return the area of square
	public double calculateArea(double w, double l){
		area = w * l;
		return area;
	}
}
