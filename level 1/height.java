/*Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is __*/
import java.util.Scanner;
public class height {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int height;
    System.out.print("height: ");
    height = input.nextInt();
    double feet=0.0328084*height;
    double inches = 12*feet;
    System.out.println("Your Height in cm is"+ height+" while in feet is"+feet+" and inches is "+inches);
    input.close();
    }
    }
    

