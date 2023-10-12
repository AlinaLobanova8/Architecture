package Architecture.homework_7.Domain;

import Architecture.homework_7.Application.DataBaseInterfaces.ICustomerRepo;
import Architecture.homework_7.Application.Logic.Primitives.Users.Customer;

import java.util.List;

public class CustomerRepository implements ICustomerRepo {
    private static CustomerRepository customerRepository;
    private List<Customer> customers;

    private CustomerRepository(){
        customerRepository = getCustomerRepository();
    }

    public static CustomerRepository getCustomerRepository(){
        if(customerRepository == null)
            customerRepository = new CustomerRepository();
        return customerRepository;
    }
    @Override
    public List<Customer> getAllCustomers(){
        return null;
    }
    public Customer getCustomerByID(int id){
        return null;
    }
}