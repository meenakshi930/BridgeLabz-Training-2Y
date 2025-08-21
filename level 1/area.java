/*Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 
Hint => Area of a Triangle is ½ * base * height
I/P => base, height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
 */
import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base ;
        System.out.print("base(cm): ");
        base = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        double height ;
        System.out.print("height(inches): ");
        height= input1.nextInt();
        double areafinal = 0.5*base*height;
        System.out.println("Area of Traingle:"+areafinal);
        input.close();
        input1.close();
    }
    
}
