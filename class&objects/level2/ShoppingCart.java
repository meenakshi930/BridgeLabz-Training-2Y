package level2;
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Add item (increase quantity)
    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added.");
    }

    // Remove item (decrease quantity)
    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    // Display total cost
    void displayTotalCost() {
        double total = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        CartItem item1 = new CartItem("Laptop", 45000, 1);
        item1.addItem(2);
        item1.removeItem(1);
        item1.displayTotalCost();
    }
}
