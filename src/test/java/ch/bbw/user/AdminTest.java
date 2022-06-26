package ch.bbw.user;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.bbw.exception.LoginException;
import ch.bbw.exception.RegisterException;

public class AdminTest {

    private Admin admin;
    private UserController userController;

    @BeforeEach
    public void setup() {
        userController = new UserController();
        admin = new Admin(userController);
    }

    @Test
    public void testRegister() {
        try {
            admin.register("ppe", "pp");
        } catch (RegisterException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testRegisterFail() {
        try {
            admin.register("ppe", "pp");
            admin.register("ppe", "pp");
            fail("RegisterException expected");
        } catch (RegisterException e) {
        }
    }

    @Test
    public void testLogin() {
        try {
            admin.register("ppe", "pp");
            admin.login("ppe", "pp");
        } catch (LoginException e) {
            fail(e.getMessage());
        } catch (RegisterException e) {
        }
    }

    @Test
    public void testLoginFail() {
        try {
            admin.register("ppe", "pp");
            admin.login("ppe", "pp1");
            fail("LoginException expected");
        } catch (LoginException e) {
        } catch (RegisterException e) {
        }
    }
}
    