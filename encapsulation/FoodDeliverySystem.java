// Interface: Discountable
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

// Abstract class: FoodItem
abstract class FoodItem implements Discountable {
    private String itemName;
    private double price;
    private int quantity;
    private double discountApplied = 0;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulated Getters
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected double getDiscountApplied() {
        return discountApplied;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: ₹" + discountApplied);
        System.out.println("Total Price: ₹" + calculateTotalPrice());
    }

    // Interface methods
    @Override
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            discountApplied = (price * quantity) * (percentage / 100);
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount of ₹" + discountApplied + " applied.";
    }
}

// Subclass: VegItem
class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - getDiscountApplied();
    }
}

// Subclass: NonVegItem
class NonVegItem extends FoodItem {
    private double nonVegCharge = 30; // extra charge per item

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double base = getPrice() * getQuantity();
        double extra = nonVegCharge * getQuantity();
        return (base + extra) - getDiscountApplied();
    }
}

// Main class
public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] order = {
            new VegItem("Paneer Butter Masala", 250, 2),
            new NonVegItem("Chicken Biryani", 300, 1),
            new NonVegItem("Mutton Curry", 350, 2)
        };

        for (FoodItem item : order) {
            item.applyDiscount(10); // Apply 10% discount
            System.out.println("---------------");
            item.getItemDetails();
            System.out.println(item.getDiscountDetails());
        }
    }
}