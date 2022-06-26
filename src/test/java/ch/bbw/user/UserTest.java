package ch.bbw.user;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.bbw.exception.LoginException;
import ch.bbw.exception.RegisterException;

public class UserTest {

    private UserController userController;
    private User user;

    @BeforeEach
    public void setup() {
        userController = new UserController();
        user = new User(userController);
    }
        
    @Test
    public void testRegister() {
        try {
            user.register("ppe", "pp");
        } catch (RegisterException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testRegisterFail() {
        try {
            user.register("ppe", "pp");
            user.register("ppe", "pp");
            fail("RegisterException expected");
        } catch (RegisterException e) {
        }
    }

    @Test
    public void testLogin() {
        try {
            user.register("ppe", "pp");
            user.login("ppe", "pp");
        } catch (LoginException e) {
            fail(e.getMessage());
        } catch (RegisterException e) {
        }
    }
    
    @Test
    public void testLoginFail() {
        try {
            user.register("ppe", "pp");
            user.login("ppe", "pp1");
            fail("LoginException expected");
        } catch (LoginException e) {
        } catch (RegisterException e) {
        }
    }
}
    