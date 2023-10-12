package Architecture.homework_2.decorator;

class SimpleCoffee implements Coffee {

    @Override
    public double getCost() {
        return 2.0;
    }

    @Override
    public String getDescription() {
        return "Простой кофе";
    }
    
}