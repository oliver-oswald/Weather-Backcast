package ch.bbw.exception;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * Excepton class if the Regstration is invalid
 */
public class RegisterException extends Exception {

    /**
     * constructor
     * @param message of the exception
     */
    public RegisterException(String message) {
        super(message);
    }
}
