package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it has an id, name, and price, just shipped in a box.
// (A ShoppingCart would NOT pass this test because it HAS products, it IS NOT a product).
public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() { return weightKg; }
    public String getDimensions() { return dimensions; }
}