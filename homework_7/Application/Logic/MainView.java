package Architecture.homework_7.Application.Logic;

import Architecture.homework_7.Application.Logic.Primitives.Users.User;
import Architecture.homework_7.Application.Logic.Primitives.ReportsType.Report;
import Architecture.homework_7.Application.ViewInterfaces.View;

import java.util.HashMap;

public class MainView implements View {

    public int selectTypeReport(){
        int choice = 0;
        String answer = null;
        if( answer.equalsIgnoreCase("Таблица"))
            choice = 1;
        if( answer.equalsIgnoreCase("График"))
            choice = 2;
        return choice;
    }

    public String fillReportsFields(){
        return new String();
    }

    public void drawTable(Report table){

    }

    public void drawGraph(Report graph){}
    @Override
    public HashMap<String, String> autorizationMenu(){
        return new HashMap<String, String>();
    }
    @Override
    public HashMap<String, String> loginMenu(){
        return new HashMap<String, String>();
    }

}