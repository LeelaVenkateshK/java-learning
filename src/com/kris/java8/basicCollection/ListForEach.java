package com.kris.java8.basicCollection;

import com.kris.collectionsLearning.MockCollections;
import com.kris.collectionsLearning.Product;

import java.util.List;

public class ListForEach {
    public static void main(String[] args) {
        List<Product> productList = MockCollections.getMockList();
        productList.forEach(e -> {
            System.out.println(e);
        });
    }
}
