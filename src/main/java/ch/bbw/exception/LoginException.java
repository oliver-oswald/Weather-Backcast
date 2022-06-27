package ch.bbw.exception;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * Excepton class if the login is invalid
 */
public class LoginException extends Exception {

    /**
     * constructor
     * @param message of the exception
     */
    public LoginException(String message) {
        super(message);
    }
}
