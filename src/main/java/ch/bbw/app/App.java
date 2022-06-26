package ch.bbw.app;

import ch.bbw.exception.RegisterException;
import ch.bbw.user.Admin;
import ch.bbw.user.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebApp app = new WebApp();
        User user1 = new User(app.getUserController());
        Admin admin1 = new Admin(app.getUserController());
        try {
            user1.register("pp", "pp");
            admin1.register("ppe", "pp");
            admin1.register("ppee", "ppe");
        } catch (RegisterException e) {
            System.out.println(e.getMessage());
        }
 
        user1 = app.getUserController().getUser("pp");

        if(user1 instanceof Admin) {
            System.out.println("User is admin");
        } else {
            System.out.println("User is not admin");
        }
    }
}
