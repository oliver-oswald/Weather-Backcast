package ch.bbw.app;

import ch.bbw.exception.LoginException;
import ch.bbw.exception.RegisterException;
import ch.bbw.exception.UserNotFoundException;
import ch.bbw.filesystem.Reader;
import ch.bbw.filesystem.Writer;
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
        User user = new User(app.getUserController());
        Admin admin = new Admin(app.getUserController());
        Writer writer = new Writer(app);
        Reader reader = new Reader(app);
        reader.readFile();

        try {
            user = app.getUserController().getUser("oliver5");
            user.login("oliver5", "1234");
        } catch (LoginException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        if (user.isAdmin()) {
            System.out.println("Admin");
        }

        writer.writeFile();
    }
}
