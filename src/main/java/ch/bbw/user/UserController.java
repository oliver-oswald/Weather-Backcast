package ch.bbw.user;

import java.util.ArrayList;

import ch.bbw.exception.UserNotFoundException;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * class that holds every user and admin of the application
 */
public class UserController {
    
    private ArrayList<User> users = new ArrayList<User>();

    /**
     * Method that returns the userlist of the application
     * @return ArrayList of User objects
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * Method that returns the user with the given username
     * @param username of the user to retrieve
     * @return User object
     * @throws UserNotFoundException if the user is not found
     */
    public User getUser(String username) throws UserNotFoundException {
        for (User user : users) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        throw new UserNotFoundException("no user with the given username");
    }

    /**
     * add a user to the controller
     * @param user of the user to add
     */
    public void add(User user){
        users.add(user);
    }
}
