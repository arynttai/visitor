package concrete_visitors;

import concrete_elements.Lipstick;
import concrete_elements.Perfume;
import interface_visitor.ProductVisitor;

public class PriceTagVisitor implements ProductVisitor {
    @Override
    public void visit(Perfume perfume) {
        System.out.println(perfume.getName() + ", " + perfume.getVolumeMl()
                + " ml - " + perfume.getPrice() + " KZT");
    }

    @Override
    public void visit(Lipstick lipstick) {
        System.out.println(lipstick.getName() + ", " + lipstick.getColor()
                + " - " + lipstick.getPrice() + " KZT");
    }
}
