package com.kris.collectionsLearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MockCollections {
    public static List<Product> getMockList() {
        List<Product> products = new ArrayList();
        products.add(new Product("Banana Cake", 2));
        products.add(new Product("Fruit Cake", 5));
        products.add(new Product("Apple Cake", 10));
        products.add(new Product("Butterscotch Cake", 5));
        products.add(new Product("Chocolate Cake", 4));
        return products;
    }

    public static Set<Product> getMockSet() {
        return new HashSet<>(getMockList());
    }
}
