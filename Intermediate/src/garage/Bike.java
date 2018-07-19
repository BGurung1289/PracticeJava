package garage;

public class Bike extends Vehicle{
	
	private int seats;
	
	public Bike(int numOfWheels, String color, String size, double engineSize, int id, int seats) {
		super(numOfWheels, color, size, engineSize, id);
		this.seats = seats;
	}
	
	public void setNumberofSeats(int num) {
		seats = num;
	}
	

	@Override
	public String horn() {
		return "toot";
	}

}
