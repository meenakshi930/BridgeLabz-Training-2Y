package lambdaexpression1;

import java.util.*;

@FunctionalInterface
interface Filter {
    void nofi();
}

public class Notification_Filter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter alert color (red/yellow/green): ");
        String n = input.next();

        Filter red = () -> System.out.println("🔴 Red alert: Emergency!\nReach hospital immediately.");
        Filter yellow = () -> System.out.println("🟡 Yellow alert\nSee your Doctor.");
        Filter green = () -> System.out.println("🟢 Green\nNot in danger");

        if (n.equalsIgnoreCase("red")) {
            red.nofi();
        } else if (n.equalsIgnoreCase("yellow")) {
            yellow.nofi();
        } else if (n.equalsIgnoreCase("green")) {
            green.nofi();
        } else {
            System.out.println("Invalid alert color!");
        }

        input.close();
    }
}
