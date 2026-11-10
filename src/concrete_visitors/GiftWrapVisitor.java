package concrete_visitors;

import concrete_elements.Lipstick;
import concrete_elements.Perfume;
import interface_visitor.ProductVisitor;

public class GiftWrapVisitor implements ProductVisitor {
    @Override
    public void visit(Perfume perfume) {
        System.out.println(perfume.getName()
                + ": Put the bottle in a box with soft paper.");
    }

    @Override
    public void visit(Lipstick lipstick) {
        System.out.println(lipstick.getName()
                + ": Put the lipstick in a small gift bag.");
    }
}
