/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____*/

public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm,3 );
        double volumeMiles3 = volumeKm3 / Math.pow(1.609, 3);
        System.out.printf("The volume of Earth in cubic kilometers is %.2f km³%n", volumeKm3);
        System.out.printf("The volume of Earth in cubic miles is %.2f mi³%n", volumeMiles3);
    }
}

