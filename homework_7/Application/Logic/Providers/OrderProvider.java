package Architecture.homework_7.Application.Logic.Providers;

import Architecture.homework_7.Domain.OrderRepository;

public class OrderProvider {
    private OrderRepository orderReposytory;

    public OrderProvider(){
        this.orderReposytory = OrderRepository.getOrderRepository();
    }
}