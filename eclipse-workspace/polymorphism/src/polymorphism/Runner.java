package polymorphism;

public class Runner {
	public static void main(String[] args) {
		System.out.println("My calaculator");
		Calculator obj = new Calculator();
		int ans = obj.add(8, 6);
		System.out.println(ans);
		System.out.println("addition of double");
		double ans1 = obj.add(88.8, 55.5);
		System.out.println(ans1);
		System.out.println("addition of long");
		long ans2 = obj.add(85595, 895548);
		System.out.println(ans2);
		
		
	}

}


