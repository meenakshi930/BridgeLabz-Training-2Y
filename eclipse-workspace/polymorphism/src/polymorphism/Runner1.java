package polymorphism;
import java.util.Scanner;

public class Runner1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int a= sc.nextInt();
		Calculator obj = new Calculator();
	switch(a) {
	case 1: int ans = obj.add(8, 6);
	        System.out.println(ans);
	        break;
	case 2: double ans1 = obj.add(88.8, 55.5);
	        System.out.println(ans1);
	        break;
	case 3: long ans2 = obj.add(85595, 895548);
	        System.out.println(ans2);
	        break;
	        
	
	}
		
	}

}
