package garage;

public class Truck extends Vehicle{

	private boolean carraige;
	public Truck(int numOfWheels, String color, String size, double engineSize,int id, boolean carraige) {
		super(numOfWheels, color, size, engineSize,id);
		this.carraige = carraige;
	}
	@Override
	public String horn() {
		return "boink";
	}
	
}
