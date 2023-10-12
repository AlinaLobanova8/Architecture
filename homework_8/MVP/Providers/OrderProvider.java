package Architecture.homework_8.MVP.Providers;

import Architecture.homework_8.MVP.Base.Guest;
import Architecture.homework_8.MVP.Base.Order;
import Architecture.homework_8.MVP.Repository.OrderRepository;

import java.util.Date;

public class OrderProvider {
    private OrderRepository orderRepository;

    public OrderProvider(){
        this.orderRepository = OrderRepository.getOrderRepository();
    }

    public void createOrder(Guest guest, Date visitDate, int idHall, int idTable){
        orderRepository.addNewOrder(new Order(guest.getId(), visitDate, idHall, idTable));
    }
}