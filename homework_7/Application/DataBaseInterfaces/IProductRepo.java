package Architecture.homework_7.Application.DataBaseInterfaces;

import Architecture.homework_7.Application.Logic.Primitives.Product;

import java.util.List;

public interface IProductRepo {
    List<Product> getAllProducts();
    Product getProductByID(int id);
}