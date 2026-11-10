import concrete_elements.Lipstick;
import concrete_elements.Perfume;
import concrete_visitors.GiftWrapVisitor;
import concrete_visitors.PriceTagVisitor;
import interface_element.Product;
import interface_visitor.ProductVisitor;

public class Main {
    public static void main(String[] args) {
        Product perfume = new Perfume("Chloé Rose Naturelle", 50, 85140);
        Product lipstick = new Lipstick("Clinique Almost Lipstick", "Black Honey", 20100);
        Product[] products = {perfume, lipstick};

        System.out.println("Gold Apple - Price tags");
        ProductVisitor priceTagVisitor = new PriceTagVisitor();
        for (Product product : products) {
            product.accept(priceTagVisitor);
        }

        System.out.println();
        System.out.println("Gold Apple - Gift wrapping");
        ProductVisitor giftWrapVisitor = new GiftWrapVisitor();
        for (Product product : products) {
            product.accept(giftWrapVisitor);
        }
    }
}
