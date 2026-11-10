package concrete_elements;

import interface_element.Product;
import interface_visitor.ProductVisitor;

public class Lipstick implements Product {
    private final String name;
    private final String color;
    private final int price;

    public Lipstick(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
