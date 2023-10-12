package Architecture.homework_5.App.MVP;

import Architecture.homework_5.App.Models.Product;

import java.util.List;

public interface Model {
    List<Product> getAllProducts();
    Product getProductByID();
    void addProductToBasket();
}