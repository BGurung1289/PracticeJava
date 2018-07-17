
public class Vehicle {
	private int numOfWheels;
	private String color;
	private String size;
	
	public Vehicle(int numOfWheels, String color, String size){
		this.numOfWheels = numOfWheels;
		this.color = color;
		this.size = size;
	}
	
	public void changeCol(String color) {
		this.color = color;
	}
}
