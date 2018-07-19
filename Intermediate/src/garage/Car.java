package garage;

public class Car extends Vehicle{
	
	private boolean convertable;
	
	public Car(int numOfWheels, String color, String size, double engineSize, int id, boolean canConvert) {
		super(numOfWheels, color, size, engineSize, id);
		convertable = canConvert;
	}
	
	public String horn() {
		return "beep beep";
	}
	
	public String convert() {
		if(convertable) {
			return "Changed";
		}
		else {
			return "Car is not convertable";
		}
	}
	
}
