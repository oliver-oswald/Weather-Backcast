package ch.bbw.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.bbw.exception.RegisterException;

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
        assert userController.getUser("pp") instanceof User;
    }

    @Test
    public void getAdminTest() {
        try {
            admin.register("pp", "test");
        } catch (RegisterException e) {
        }
        assert userController.getUser("pp") instanceof Admin;
    }
}
    