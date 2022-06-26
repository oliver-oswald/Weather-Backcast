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

    public User getUser(String username) {
        for (User user : users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public void add(User user){
        users.add(user);
    }
}
