package paintWizard;

public class paintWiz {
	
	Paint [] paints = new Paint[3];
	
	public paintWiz(){
		paints[0] = new Paint("Cheapo Paint",20, 19.99,10);
		paints[1] = new Paint("AverageJoes", 15, 17.99, 11);
		paints[2] = new Paint("DuluxourousPaints", 10, 25, 20);
	}
	
	
	public double cheapestTotalPaint() {
		int i = 0;
		double cheapest = 0.0;
		while(i < paints.length - 1) {
			cheapest = cheapestPaint(paints[i], paints[i+1]);
			i++;
		}
		return cheapest;
	}
	
	public int getAvailablePaints() {
		int i = 0;
		while(i < paints.length) {
			System.out.println(paints[i].getName());
			i++;
		}
		return paints.length;
		
	}
	
	public double cheapestPaint(Paint a, Paint b) {
		if(a.getPrice() > b.getPrice()) {
			return b.getPrice();
		}
		else{
			return a.getPrice();
		}
	}
	
	public Paint cheapestPaintArea(int roomArea) {
		int a = totalArea(paints[0]);
		int b = totalArea(paints[1]);
		int c = totalArea(paints[2]);
		
		if(roomArea % a == 0) {
			return paints[0];
		}
		else if(roomArea % b == 0) {
			return paints[1];
		}
		else if(roomArea % c == 0) {
			return paints[2];
		}
		else {
			System.out.println("There will be wastage");
			a = roomArea % a;
			b = roomArea % b;
			c = roomArea % c;
			if(a < b && a < c) {
				return paints[0];
			}
			else if(b < a && b < c) {
				return paints[1];
			}
			else if(c < a && c < b) {
				return paints[2];
			}
			return null;
			
		}
		
	}
	
	public int totalArea(Paint a) {
		return a.getSize() * a.getCoverage();
	}
	
	public Paint getPaint(int selected) {
		return paints[selected];
	}
	
	
}
