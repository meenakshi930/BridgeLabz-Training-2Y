import java.util.Scanner;
public class perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side ;
        System.out.print("side: ");
        side = input.nextInt();
        double perimeter = 4*side;
        System.out.println("perimeter of square:"+perimeter);
        input.close();
    }
    
}
