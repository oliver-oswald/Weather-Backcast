package ch.bbw.user;

import ch.bbw.exception.LoginException;


/*
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/*
 * class that represents a user of the application
*/
public class User {

    private String name;
    private String passwort;

    /*
     * constructor
     * @param name name of the user
     * @param passwort password of the user
     */
    public User(String name, String passwort) {
        this.name = name;
        this.passwort = sha1(passwort);
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

    /*
     * Method that checks if the password is correct
     * @param passwort the password that should be checked
     * @param user the user that should be checked
     * @throws LoginException if the password is not correct
     */
    public void login(String name, String passwort) throws LoginException {
        if (!this.name.equals(name) || !this.passwort.equals(sha1(passwort))) {
            throw new LoginException("Login fehlgeschlagen");
        }
    }
}
