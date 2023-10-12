package Architecture.homework_7.Domain;

import Architecture.homework_7.Application.DataBaseInterfaces.IStaffRepo;
import Architecture.homework_7.Application.Logic.Primitives.Users.Staff;

import java.util.List;

public class StaffRepository implements IStaffRepo {
    private static StaffRepository staffRepository;
    private List<Staff> staff;

    private StaffRepository(){
        staffRepository = getStaffRepository();
    }
    public static StaffRepository getStaffRepository(){
        if(staffRepository == null)
            staffRepository = new StaffRepository();
        return staffRepository;
    }
@Override
    public List<Staff> getAllStaff(){
        return null;
    }

    public Staff getStaffByID(int id){
        return null;
    }
}