
public class Circle {
	//private fields
	private double diameter;
	private double circumference;
	private double area;
		
	//constructor
	public Circle(double d){
		diameter = d;
	}
	
	//methods
	
	//getter and setter
	//set diameter from user
	public void setDiameter(double d){
		diameter = d;
	}
	public double getDiameter(){
		return diameter;
	}
	
	//calculate the circumference of a circle with user input
	public double calculateCircumference(double d){
		circumference = Math.PI * d;
		return circumference;
	}
	
	//calculate area method passing in user input diameter and return the area of circle
	public double calculateArea(double d){
		area = Math.PI * Math.pow(d/2, 2);
		return area;
	}
}
