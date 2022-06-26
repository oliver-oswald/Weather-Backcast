package ch.bbw.user;

import ch.bbw.exception.LoginException;
import ch.bbw.exception.RegisterException;


/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * class that represents a user of the application
*/
public class User {

    private String name;
    private String password;
    private UserController userController;

    /**
     * constructor to initialize the user
     * @param the user controller object
     */
    public User(UserController userController) {
        this.userController = userController;
    }

    /**
     * constructor to copy the user object
     * @param the user object
     */
    public User(User user) {
        this.name = user.name;
        this.password = user.password;
        this.userController = user.userController;
    }

    /**
     * getters and setters
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * getters and setters
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * getters and setters
     * @return the user controller
     */
    public UserController getUserController() {
        return userController;
    }

    /*
     * Method that encrypt the password with SHA-1
     * @param passwort the password that should be encrypted
     * @return the encrypted password
     */
    private static String sha1(String input) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuffer hexString = new StringBuffer();
            for (int i = 0; i < messageDigest.length; i++) {
                hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
            }
            return hexString.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * Method that checks if the password is correct
     * @param password the password that should be checked
     * @param name the name of the user that should be checked
     * @throws LoginException if the password is not correct
     */
    public void login(String name, String password) throws LoginException {
        if (!this.name.equals(name) || !this.password.equals(sha1(password))) {
            throw new LoginException("Login fehlgeschlagen");
        }
    }


    /**
     * Method that registers a new user and if successful adds the user to the userController
     * @param name name of the user
     * @param password password of the user
     * @throws RegisterException if the user already exists
     */
    public void register(String name, String password) throws RegisterException {
        if (userController.getUsers()
                .stream()
                .filter(o -> o.getName().equals(name) == true)
                .findAny()
                .isPresent() ? true : false) {
            throw new RegisterException("Benutzer existiert bereits");
        } else {
            this.name = name;
            this.password = sha1(password);
            if(this instanceof Admin) {
                userController.add(new Admin((Admin) this));
            } else {
                userController.add(new User(this));
            }
        }
    }

    /**
     * Method that checks if the user is an admin
     * @return true if the user is an admin
     */
    public boolean isAdmin() {
        return false;
    }

}
