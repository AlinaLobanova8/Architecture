package Architecture.homework_7.Domain;

import Architecture.homework_7.Application.DataBaseInterfaces.ISupplierRepo;
import Architecture.homework_7.Application.Logic.Primitives.Users.Supplier;

import java.util.List;

public class SupplierRepository implements ISupplierRepo {
    private static SupplierRepository supplierRepository;
    private List<Supplier> suppliers;

    private SupplierRepository(){
        supplierRepository = getSupplierRepository();
    }

    public static SupplierRepository getSupplierRepository(){
        if(supplierRepository == null)
            supplierRepository = new SupplierRepository();
        return supplierRepository;
    }
    @Override
    public List<Supplier> getAllProviders(){
        return null;
    }
    public Supplier getProviderByID(int id){
        return null;
    }
}