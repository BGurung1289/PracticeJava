package garageTest;

import static org.junit.Assert.*;

import org.junit.Test;

import garage.Car;
import garage.Garage;

public class GarageTest {
	
	@Test
	public void testAddVehicle() {
		Garage testGarage = new Garage();
		Car flash = new Car(4, "Red", "BIG", 1.4, 1, true);
		
		testGarage.addVehicle(flash);
		assertEquals("Not correctly added", testGarage.get(), flash);
	}
	
	
	@Test
	public void testRemoveVehicle() {
		Garage testGarage = new Garage();
		Car flash = new Car(4, "Red", "BIG", 1.4, 1, true);
		Car kiki = new Car(4, "pink", "SMALL", 1.2, 2, true);
		
		testGarage.addVehicle(flash);
		testGarage.addVehicle(kiki);
		testGarage.removeVehicle(flash);
		assertEquals("Not removed", testGarage.garageSize(), 1);
	}
	
	@Test
	public void testEmpty() {
		Garage testGarage = new Garage();
		Car flash = new Car(4, "Red", "BIG", 1.4, 1, true);
		Car kiki = new Car(4, "pink", "SMALL", 1.2, 2, true);
		testGarage.addVehicle(flash);
		testGarage.addVehicle(kiki);
		
		testGarage.empty();
		assertEquals("not empty", testGarage.garageSize(), 0);
		
	}
	
}
