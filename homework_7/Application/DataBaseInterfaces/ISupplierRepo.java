package Architecture.homework_7.Application.DataBaseInterfaces;

import Architecture.homework_7.Application.Logic.Primitives.Users.Supplier;

import java.util.List;

public interface ISupplierRepo {
    List<Supplier> getAllProviders();
    Supplier getProviderByID(int id);
}