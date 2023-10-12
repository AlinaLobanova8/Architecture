package Architecture.homework_7.Application.DataBaseInterfaces;

import Architecture.homework_7.Application.Logic.Primitives.Order;

import java.util.List;

public interface IOrderRepo {
    List<Order> getAllOrders();
    Order getOrderByID(int id);
}