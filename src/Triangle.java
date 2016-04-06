
public class Triangle {
	//private fields
	private double side1;
	private double side2and3;		
	private double trianglePerimeter;
	
	
	//constructor default
	public Triangle(){
		
	}
	//constructor with parameters
	public Triangle(double s1, double s2and3){
		side1 = s1;
		side2and3 = s2and3;
		
	}

	//methods
	
	//getter and setter
	//set sides 1,2,3 of triangle from user
	public void setSide1(double s1){
		side1 = s1;
	}
	public double getSide1(){
		return side1;
	}
	
	public void setSide2and3(double s2and3){
		side2and3 = s2and3;
	}
	public double getSide2and3(){
		return side2and3;
	}
	
	
	
	//calculate the perimeter of triangle passing in user input of 3 sides
	public double calculatePerimeterTriangle(double s1, double s2and3){
		trianglePerimeter = s1 + s2and3 + s2and3 ;
		return trianglePerimeter;
	}
}
