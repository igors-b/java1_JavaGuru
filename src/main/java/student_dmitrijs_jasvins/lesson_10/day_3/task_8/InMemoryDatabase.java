package student_dmitrijs_jasvins.lesson_10.day_3.task_8;

import java.util.ArrayList;
import java.util.List;

class InMemoryDatabase implements Database {

    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}