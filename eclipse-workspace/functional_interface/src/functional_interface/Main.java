package functional_interface;
@FunctionalInterface
interface calculator {
	int cal(int a, int b);
}
public class Main {
	public static void main(String[] args) {
		calculator sum =(a,b) -> (a+b);
		calculator sub =(a,b) -> (a-b);
		calculator mul =(a,b) -> (a*b);
		calculator div =(a,b) -> (a/b);
		System.out.println(sum.cal(10, 8));
		System.out.println(sub.cal(10, 8));
		System.out.println(mul.cal(10, 8));
		System.out.println(div.cal(10, 8));
	}

	
}


