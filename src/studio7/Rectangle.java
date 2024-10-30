package studio7;

public class Rectangle {
	private double length;
	private double width;
	
	
	
	public Rectangle() {
	}
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		return length*width;
	}
	public double perimeter() {
		return (length+width)*2;
	}
	public boolean isSquare() {
		return length==width;
	}
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,3);
		System.out.println(r1.getLength());
		System.out.println(r1.getWidth());
		System.out.println(r1.isSquare());
		}

}


