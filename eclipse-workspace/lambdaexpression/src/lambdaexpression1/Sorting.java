//Scenario: An online shop wants to sort products differently based on sales
//campaigns /by price, rating, discount).
//Task: Use a lambda with Comparator to sort products dynamically.
package lambdaexpression1;
import java.util.*;

@FunctionalInterface
interface Sort {
    void filter();
}

public class Sorting {
    public static void main(String[] args) {
        Sort price = () -> System.out.println("Sorting products by price (low to high)...");
        Sort rating = () -> System.out.println("Sorting products by customer rating (high to low)...");
        Sort discount = () -> System.out.println("Sorting products by maximum discount...");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter filter type (price/rating/discount): ");
        String n = input.next();

        if (n.equalsIgnoreCase("price")) {
            price.filter();
        } else if (n.equalsIgnoreCase("rating")) {
            rating.filter();
        } else if (n.equalsIgnoreCase("discount")) {
            discount.filter();
        } else {
            System.out.println("Invalid input! Please enter price, rating, or discount.");
        }

        input.close();
    }
}


