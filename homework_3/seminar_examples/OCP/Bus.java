package Architecture.homework_3.seminar_examples.OCP;

public class Bus extends Vehicle {

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
       
    }

    @Override
    public double calculateAllowedSpeed() {
        return super.maxSpeed * 0.5;
    }
    
    
}