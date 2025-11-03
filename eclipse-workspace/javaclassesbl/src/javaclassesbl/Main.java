package javaclassesbl;

public class Main {
	public static void main(String[] args) {
Calculator obj = new  Calculator();

int ans = obj.add(2, 6);
System.out.println(ans);

double ans_double = obj.add(55.5, 99.88);
System.out.println(ans_double);

long ans_long = obj.add(581287, 5847125 );
System.out.println(ans_long);

}
}
