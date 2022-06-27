package ch.bbw.exception;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * Excepton class if the user was not found
 */
public class UserNotFoundException extends Exception {
    
    /**
     * constructor
     * @param message of the exception
     */
    public UserNotFoundException(String message) {
        super(message);
    }
}
