package Architecture.homework_5;

import Architecture.homework_5.App.Core.ConsoleView;
import Architecture.homework_5.App.Core.MainPresenter;
import Architecture.homework_5.App.MVP.Presenter;

public class Main {
    public static void main(String[] args) {
        Presenter presenter = new MainPresenter();
        presenter.runEntryMenuLogic();
    }
}