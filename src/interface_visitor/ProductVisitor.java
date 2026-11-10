package interface_visitor;

import concrete_elements.Lipstick;
import concrete_elements.Perfume;

public interface ProductVisitor {
    void visit(Perfume perfume);
    void visit(Lipstick lipstick);
}
