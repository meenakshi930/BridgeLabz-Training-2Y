// Interface: Taxable
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract class: Product
abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulated Getters and Setters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method
    public abstract double calculateDiscount();

    // Concrete method
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: ₹" + price);
    }
}

// Subclass: Electronics
class Electronics extends Product implements Taxable {
    private int warrantyYears;

    public Electronics(String productId, String name, double price, int warrantyYears) {
        super(productId, name, price);
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "18% GST applied on Electronics";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Electronics");
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println(getTaxDetails());
    }
}

// Subclass: Clothing
class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(String productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "5% GST applied on Clothing";
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Clothing");
        System.out.println("Size: " + size);
        System.out.println(getTaxDetails());
    }
}

// Subclass: Groceries
class Groceries extends Product {
    private String expiryDate;

    public Groceries(String productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: Groceries");
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("No tax applied on Groceries");
    }
}

// Main class
public class ECommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("E101", "Smartphone", 30000, 2),
            new Clothing("C202", "T-Shirt", 800, "M"),
            new Groceries("G303", "Rice Pack", 500, "2025-12-31")
        };

        for (Product p : products) {
            System.out.println("---------------");
            p.displayDetails();

            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0;
            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.printf("Final Price: ₹%.2f\n", finalPrice);
        }
    }
}