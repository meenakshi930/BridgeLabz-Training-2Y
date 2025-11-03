package abstraction;

public class Car implements Vehicle {

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.print("speed is 100");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.print("color is red");
	}
	public static void main(String[] arg) {
		Car childobj = new Car();
		childobj.speed();
		childobj.color();
	}
}
