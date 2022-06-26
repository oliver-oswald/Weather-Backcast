package ch.bbw.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.bbw.exception.RegisterException;
import ch.bbw.exception.UserNotFoundException;

public class UserControllerTest {

    private UserController userController;
    private User user;
    private Admin admin;

    @BeforeEach
    public void setup(){
        userController = new UserController();
        user = new User(userController);
        admin = new Admin(userController);
    }
        
    @Test
    public void getUserTest() {
        try {
            user.register("pp", "test");
        } catch (RegisterException e) {
        }
        try {
            assert userController.getUser("pp") instanceof User;
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAdminTest() {
        try {
            admin.register("pp", "test");
        } catch (RegisterException e) {
        }
        try {
            assert userController.getUser("pp") instanceof Admin;
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
    