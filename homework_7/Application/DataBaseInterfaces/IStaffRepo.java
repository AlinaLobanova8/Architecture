package Architecture.homework_7.Application.DataBaseInterfaces;

import Architecture.homework_7.Application.Logic.Primitives.Users.Staff;

import java.util.List;

public interface IStaffRepo {
    List<Staff> getAllStaff();
    Staff getStaffByID(int id);
}