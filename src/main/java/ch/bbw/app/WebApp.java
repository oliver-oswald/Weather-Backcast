package ch.bbw.app;

import ch.bbw.user.UserController;

public class WebApp {

    private UserController userController;

    public WebApp() {
        userController = new UserController();
    }

    public UserController getUserController() {
        return userController;
    }
    
}
