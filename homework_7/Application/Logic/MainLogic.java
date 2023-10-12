package Architecture.homework_7.Application.Logic;

import Architecture.homework_7.Application.Logic.Primitives.Users.Staff;
import Architecture.homework_7.Application.Logic.Primitives.ReportsType.Graph;
import Architecture.homework_7.Application.Logic.Primitives.ReportsType.Table;
import Architecture.homework_7.Application.Logic.Primitives.Users.User;
import Architecture.homework_7.Application.Logic.Providers.*;
import Architecture.homework_7.Application.ModelInterfaces.Model;

import java.util.HashMap;

public class MainLogic  implements Model {
    private OrderProvider orderProvider;
    private CustomerProvider customerRepository;
    private SupplierProvider providerRepository;
    private ProductProvider productRepository;
    private StaffProvider staffRepository;
    private Staff manager;

    public MainLogic() {
        this.orderProvider = new OrderProvider();
        this.customerRepository = new CustomerProvider();
        this.providerRepository = new SupplierProvider();
        this.productRepository = new ProductProvider();
        this.staffRepository = new StaffProvider();
    }

    public static Table createTable(String str){
        return new Table();
    }

    public static Graph createGraph(String str){
        return new Graph();
    }

    public boolean checkUser(HashMap<String,String> userData){
        for (User user: staffRepository.getStaffList()) {
            if (user.getPass().equals(userData.values()) && user.getFirstName().equals(userData.keySet())) {
                this.manager = (Staff) user;
                return true;
            }
        }
        return false;
    }

}