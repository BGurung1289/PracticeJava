
public class funcs {

	
	public void print(String input) {
		System.out.println(input);
	}
	
	public String greeting() {
		return "Hello World";
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
//	public int add(int a, int b, boolean c) {
//		if(c)
//			return a+b;
//		else
//			return a*b;
//	}
	
	public int nonZero(int a, int b) {
		if(a == 0) {
			return b;
		}
		else if(b == 0) {
			return a;
		}
		else 
			return a+b;
	}
	
	public void n(int[] arr) {
		for(int i = 0; i < 10 ; i = i+2) {
			System.out.println(nonZero(arr[i], arr[i+1]));
		}
	}
	
	public void out(int[] arr) {
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
	
	public void dup(int[] arr, int[] arr2) {
		for(int i = 0; i < arr.length ; i++){
			arr2[i] = arr[i];
		}
		for(int i = 0; i < arr.length ; i++){
			arr2[i] = arr2[i] * 10;
		}
	}
	
}
