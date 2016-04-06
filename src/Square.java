
public class Square {
		//private fields
		private double sideOfSquare;
		private double area;
		private double squarePerimeter;
		
		//constructor
		public Square(double s){
			sideOfSquare = s;
		}
		
		//methods
		
		//getter and setter
		//set side of square from user
		public void setSide(double s){
			sideOfSquare = s;
		}
		public double getSide(){
			return sideOfSquare;
		}
		
		//calculate the perimeter of a square
			public double calculatePerimeter(double s){
				squarePerimeter = 4 * s;
				return squarePerimeter;
			}
		
		//calculate area method passing in user input side and return the area of square
		public double calculateArea(double s){
			area = s * s;
			return area;
		}
	
}
