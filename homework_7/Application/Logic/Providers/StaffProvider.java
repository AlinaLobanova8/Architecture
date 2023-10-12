package Architecture.homework_7.Application.Logic.Providers;

import Architecture.homework_7.Application.Logic.Primitives.Users.Staff;
import Architecture.homework_7.Domain.StaffRepository;

import java.util.List;

public class StaffProvider {
    private StaffRepository staffRepository;
    public StaffProvider(){
        this.staffRepository = StaffRepository.getStaffRepository();
    }

    public List<Staff> getStaffList(){
        return staffRepository.getAllStaff();
    }
}