package Architecture.homework_7.Application.DataBaseInterfaces;

import Architecture.homework_7.Application.Logic.Primitives.Users.Customer;

import java.util.List;

public interface ICustomerRepo {
    List<Customer> getAllCustomers();
    Customer getCustomerByID(int id);
}