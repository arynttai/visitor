# Gold Apple Gift Shop

This is my Java project for Assignment 6. I used the Visitor pattern for
two products in a gift shop: perfume and lipstick.

## What the program does

- `PriceTagVisitor` prints a price tag. For perfume, it shows the bottle
  size and price. For lipstick, it shows the color and price.
- `GiftWrapVisitor` prints a packing tip. Perfume goes in a box with soft
  paper. Lipstick goes in a small gift bag.

## How Visitor works

In `Main`, I put both products in one array. I go through the array twice:
first to print the prices, then to print the packing tips.

Each product has an `accept` method. The `ProductVisitor` interface has
two `visit` methods, one for `Perfume` and one for `Lipstick`.

For example, `product.accept(visitor)` calls the `accept` method of the
lipstick when the product is a lipstick. Inside that method,
`visitor.visit(this)` calls the lipstick version of `visit`. The visitor
then prints either a price tag or a packing tip. Both the product type
and the visitor type matter. This is called double dispatch.

## Clean Code

1. I used clear names. `PriceTagVisitor` tells you what it prints.
2. Each visitor has one job. I can change a packing tip in `GiftWrapVisitor`
   without touching the price tags.
3. Each product calls `visit(this)`, so I do not need `instanceof` checks.
4. Product fields are private. Visitors use getters to read the values
   they need.
5. To add a new operation, I can write one more visitor and use it in
   `Main`. The product classes stay the same.

## How to run

Open the project in IntelliJ IDEA and run `Main.java`.
