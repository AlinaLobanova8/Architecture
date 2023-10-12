package Architecture.homework_8.MVP;

import Architecture.homework_8.MVP.Base.Guest;
import Architecture.homework_8.MVP.Providers.*;

public class Model {
    private HallsProvider hallsProvider;
    private GuestProvider guestProvider;
    private OrderProvider orderProvider;
    private TableProvider tableProvider;
    private Guest guest;

    public Model(){
        this.tableProvider = new TableProvider();
        this.hallsProvider = new HallsProvider();
        this.guestProvider = new GuestProvider();
        this.orderProvider = new OrderProvider();
    }

    public HallsProvider getHallsProvider() {
        return hallsProvider;
    }

    public GuestProvider getGuestProvider() {
        return guestProvider;
    }

    public OrderProvider getOrderProvider() {
        return orderProvider;
    }

    public TableProvider getTableProvider() {
        return tableProvider;
    }

    public void setGuest(Guest guest){
        this.guest = guest;
    }

    public Guest getGuest() {
        return guest;
    }
}