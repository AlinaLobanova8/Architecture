package Architecture.homework_2.fabric;

public class Main {
    public static void main(String[] args) {
        Creator creator = new CreatePizza();
        Product product = creator.createProduct();
        product.showProduct();
        creator = new CreateSoup();
        product = creator.createProduct();
        product.showProduct();

    }
    
}