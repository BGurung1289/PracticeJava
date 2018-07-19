package paintWizard;

public class Paint {
	
	private String name;
	private int size;
	private double price;
	private int coverage;
	
	public Paint(String name, int size, double price, int coverage){
		this.name = name;
		this.size = size;
		this.price = price;
		this.coverage = coverage;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getSize() {
		return size;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCoverage() {
		return coverage;
	}
	
}
