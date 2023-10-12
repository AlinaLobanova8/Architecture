package Architecture.homework_7.Application.ViewInterfaces;

import Architecture.homework_7.Application.Logic.Primitives.Users.User;

import java.util.HashMap;

public interface View {
     HashMap<String, String> autorizationMenu();
     HashMap<String, String> loginMenu();
}