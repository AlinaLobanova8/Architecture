package Architecture.homework_5.App.MVP;

import Architecture.homework_5.App.Models.User;

public interface Presenter {
    boolean login();
    boolean registration ();
    void runEntryMenuLogic();
}