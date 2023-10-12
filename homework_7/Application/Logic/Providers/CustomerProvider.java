package Architecture.homework_7.Application.Logic.Providers;

import Architecture.homework_7.Domain.CustomerRepository;

import java.util.List;

public class CustomerProvider {
    private CustomerRepository customerRepository;
    public CustomerProvider(){
        this.customerRepository = CustomerRepository.getCustomerRepository();
    }

}