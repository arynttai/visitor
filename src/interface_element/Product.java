package interface_element;

import interface_visitor.ProductVisitor;

public interface Product {
    void accept(ProductVisitor visitor);
}
