package Architecture.homework_7.Domain;

import Architecture.homework_7.Application.DataBaseInterfaces.IOrderRepo;
import Architecture.homework_7.Application.Logic.Primitives.Order;

import java.util.List;

public class OrderRepository implements IOrderRepo {
    private static OrderRepository orderRepository;
    private List<Order> orders;

    private OrderRepository(){orderRepository = getOrderRepository();}

    public static OrderRepository getOrderRepository(){
        if(orderRepository == null){
            orderRepository = new OrderRepository();
        }
        return orderRepository;
    }
@Override
    public List<Order> getAllOrders(){
        return null;
    }

    public Order getOrderByID(int id){
        return null;
    }

}