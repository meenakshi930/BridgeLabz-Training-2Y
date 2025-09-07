package level3;

import java.util.Scanner;

public class CalendarProgram {
    public static void printMonth(int month, int year) {
        int days;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: days = 31; break;
            case 4: case 6: case 9: case 11: days = 30; break;
            case 2: days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28; break;
            default: days = 0;
        }
        System.out.println("Month " + month + " of " + year + " has " + days + " days.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        printMonth(m, y);
        sc.close();
    }
}
