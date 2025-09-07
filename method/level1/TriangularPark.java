import java.util.Scanner;

public class TriangularPark {
    public static double calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3, 5000);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5 km.");
        sc.close();
    }
}

