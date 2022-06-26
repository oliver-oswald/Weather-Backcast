package ch.bbw.user;

import java.util.ArrayList;

/*
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/*
 * class that holds every user and admin of the application
 */
public class UserController {
    
    private ArrayList<User> users = new ArrayList<User>();

    public ArrayList<User> getUsers() {
        return users;
    }
}
