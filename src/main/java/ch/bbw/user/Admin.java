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
     * @param the user controller object
     */
    public Admin(UserController userController) {
        super(userController);
    }

    /**
     * constructor to copy the admin object
     * @param the admin object
     */
    public Admin(Admin admin) {
        super(admin);
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
