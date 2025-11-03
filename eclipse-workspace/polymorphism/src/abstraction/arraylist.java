package abstraction;
import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(22);
		list.add(88);
		list.add(99);
		System.out.println(list);
		list.remove(3); // we need to pass an index for remove
		System.out.println(list);
		list.add(100);
		System.out.println(list);
		
	} 
	

}
