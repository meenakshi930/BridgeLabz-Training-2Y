package level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemTest {
    public static void main(String[] args) {
        Item item1 = new Item(2001, "Laptop", 45000.0);
        item1.displayDetails();
        int quantity = 2;
        System.out.println("Total Cost for " + quantity + " items: " + item1.calculateTotalCost(quantity));
    }
}
