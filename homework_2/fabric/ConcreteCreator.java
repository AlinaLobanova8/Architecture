package Architecture.homework_2.fabric;

public class ConcreteCreator extends Creator{

    @Override
    public Product createProduct() {
        return new ConcreteProduct(); 
    }    
}