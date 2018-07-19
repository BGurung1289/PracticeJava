package garage;
import java.util.ArrayList;

public class Garage {
	ArrayList garage = new ArrayList();
	
	public Garage() {
	}
	
	public void addVehicle(Vehicle v) {
		garage.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		garage.remove(v);
	}
	
	public void empty() {
		garage.clear();
	}
	
	public Object get() {
		return garage.get(0);
	}
	
	public int garageSize() {
		return garage.size();
	}
	
}
