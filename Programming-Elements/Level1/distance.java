/*Write a program the find the distance in yards and miles for the distance provided by user in feets
Hint => 1 mile = 1760 yards and 1 yard is 3 feet
I/P => distanceInFeet
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___ */
import java.util.Scanner;
public class distance {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double distance ;
        System.out.print("distance(feet): ");
        distance= input.nextInt();
        double yards =  distance/3;
        double mile=  1760*yards;
        System.out.println("miles"+mile);
        System.out.println("yards"+yards);
        input.close();
    }
    
}
