package Architecture.homework_7.Application.Logic.Providers;

import Architecture.homework_7.Domain.ProductRepository;

public class ProductProvider {
    private ProductRepository productRepository;
    public ProductProvider(){
        this.productRepository = ProductRepository.getProductRepository();
    }

}