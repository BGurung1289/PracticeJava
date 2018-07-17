
public class basic {
	
	
	public static void main(String[] args) {
//		System.out.println("hello world");
//		String output = "hello";
//		System.out.println(output + "\nWORLD!");
		
		funcs fun = new funcs();
		
//		System.out.println(fun.add(12, 6));
		
		
//		fun.print("riri");
//		System.out.println(fun.greeting());
//		System.out.println(fun.add(3, 3, true));
//		System.out.println(fun.add(3,3,false));
//		System.out.println(fun.nonZero(2,2));
//		
		
//		for(int i = 0; i < 10 ; i++) {
//			System.out.println(fun.nonZero(0, i));
//		}
		
		int [] arr = {0,35,0,78,12,34,45,0,0,90};
		int [] arr2 = new int [10];
		
		
		//fun.n(arr);
		//fun.out(arr);
		
		fun.dup(arr, arr2);
		fun.out(arr2);
		
		
	}
	
}
