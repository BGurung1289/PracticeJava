
public class Interm {
	
	public int blackJack(int a, int b) {
			if(a > b && a < 22) {
				return a;
			}
			else if(b > a && b < 22){
				return b;
			}
			else if(a >= 22){
				return b;
			}
			else if(b >= 22){
				return a;
			}
			else {
				return 0;
			}
	}
	
	public int uniqSum(int a, int b, int c) {
		if(a == b && b == c) {
			return 0;
		}
		else if(a == b && b != c) {
			return c;
		}
		else if(a != b && b != c) {
			return a+b+c;
		}
		else if(a != b && b == c) {
			return a;
			
		}
		else {
			System.out.println("Error");
			return 0;
		}
	}
	
	public boolean tooHot(int temp, boolean isSummer) {
		if(isSummer) {
			if(temp > 100 || temp < 60) {
				return false;
			}
			else {
				return true;
			}
		}
		else {
			if(temp > 90 || temp < 60) {
				return false;
			}
			else {
				return true;
			}
			
		}
		
	}
	
}
