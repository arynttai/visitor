package concrete_elements;

import interface_element.Product;
import interface_visitor.ProductVisitor;

public class Perfume implements Product {
    private final String name;
    private final int volumeMl;
    private final int price;

    public Perfume(String name, int volumeMl, int price) {
        this.name = name;
        this.volumeMl = volumeMl;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(ProductVisitor visitor) {
        visitor.visit(this);
    }
}
