package garage;

public abstract class Vehicle {
	private int numOfWheels;
	private String color;
	private String size;
	private double engineSize;
	private int id;
	
	public Vehicle(int numOfWheels, String color, String size, double engineSize, int id){
		this.numOfWheels = numOfWheels;
		this.color = color;
		this.size = size;
		this.id = id;
	}
	
	public void changeCol(String color) {
		this.color = color;
	}
	
	public void changeEngine(double engineSize) {
		this.engineSize = engineSize;
	}
	
	public abstract String horn();
}
