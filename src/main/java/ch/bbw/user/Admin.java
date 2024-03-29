package ch.bbw.user;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * class that represents the admin of the application
*/
public class Admin extends User {

    /**
     * constructor to initialize the admin
     * @param userController the user controller object
     */
    public Admin(UserController userController) {
        super(userController);
    }

    /**
     * constructor to copy the admin object
     * @param admin the admin object
     */
    public Admin(Admin admin) {
        super(admin);
    }

    /**
     * constructor to inzialize a new admin object
     * @param name of the admin
     * @param password of the admin
     * @param userController of the application
     */
    public Admin(String name, String password, UserController userController) {
        super(name, password, userController);
    }

    /**
     * Method that checks if the user is an admin
     * @return true if the user is admin
     */
    @Override
    public boolean isAdmin() {
        return true;
    }
}
