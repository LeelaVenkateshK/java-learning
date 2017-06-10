package com.kris.collectionsLearning;

import java.util.List;

public class ComparatorAndComparable {
    public static void main(String[] args) {
        List<Product> products = MockCollections.getMockList();
        ComparatorAndComparable.usingComparable(products);
        ComparatorAndComparable.usingComparator(products);
    }

    public static void usingComparable(List<Product> products) {
        products.sort(Product.PRODUCT_COMPARATOR_BY_WEIGHT);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void usingComparator(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
