package main.java.tradeshift;

public class Calculator {
	
	public TriangleType GetTriangleType(int a, int b, int c) throws IndexOutOfBoundsException{
		
		if(a < 0 || b < 0 || c < 0){
			throw new IndexOutOfBoundsException();
		}
		
		Triangle triangle = new Triangle(a, b, c);
		
		if(CheckEquilateral(triangle))
			return TriangleType.EQUILATERAL;
		
		if(CheckIsosceles(triangle))
			return TriangleType.ISOSCELES;
		
		if(CheckScalene(triangle))
			return TriangleType.SCALENE;
		
		return TriangleType.UNKNOWN;
	}
	
	private boolean CheckEquilateral(Triangle triangle){
		// all sides are equal
		return triangle.a == triangle.b && triangle.b == triangle.c;		
	}
	
	private boolean CheckIsosceles(Triangle triangle){
		//two sides are equal
		return triangle.a == triangle.b || triangle.a == triangle.c || triangle.b == triangle.c;
	}
	
	private boolean CheckScalene(Triangle triangle){
		return triangle.a != triangle.b && triangle.b != triangle.c;
	}
}
