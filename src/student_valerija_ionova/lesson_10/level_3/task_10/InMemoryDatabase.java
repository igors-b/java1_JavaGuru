package student_valerija_ionova.lesson_10.level_3.task_10;

import java.util.ArrayList;
import java.util.Optional;

public class InMemoryDatabase implements  Database{

    private ArrayList <Product> products = new ArrayList<>();

    ArrayList <Product> getProducts(){
        return products;
    }

    @Override
    public void save(Product product) {
          products.add(product);
    }

    @Override
    public Optional <Product> findByTitle(String productTitle) {
            Optional <Product> result = Optional.empty();
            for (Product product : products){
                if (product.getTitle().equals(productTitle)){
                    result = Optional.ofNullable(product);
                }
            }

        return result;
    }


}
