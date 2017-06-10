package com.kris.collectionsLearning;

import java.util.Comparator;
import java.util.Objects;

public class Product {
    /**
     * Before java 8 comparator was as below
     */
    /*public final static Comparator<Product> PRODUCT_COMPARATOR_BY_WEIGHT = new
            Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    long objectOneWeight = o1.getWeight(),
                            objectTwoWeight = o2.getWeight();
                    return objectOneWeight == objectTwoWeight ? 0 :
                            (objectOneWeight > objectTwoWeight ? 1 : -1);

                }
            }*/
    public static final Comparator<Product> PRODUCT_COMPARATOR_BY_WEIGHT =
            Comparator.comparing(Product::getWeight);

    //    public final static Comparable<Product>
    // PRODUCT_COMPARABLE_BY_WEIGHT = Comparable.compareTo()
    private String name;
    private long weight;

    public Product(String name, long weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return this.weight == product.weight &&
                Objects.equals(this.name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString() {
        return this.name + " ::: " + this.weight;
    }
}
