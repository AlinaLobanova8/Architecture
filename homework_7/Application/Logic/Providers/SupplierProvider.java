package Architecture.homework_7.Application.Logic.Providers;

import Architecture.homework_7.Domain.SupplierRepository;

public class SupplierProvider {
    private SupplierRepository supplierRepository;
    public SupplierProvider(){
        this.supplierRepository = SupplierRepository.getSupplierRepository();
    }

}