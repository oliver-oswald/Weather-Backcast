package ch.bbw.user;

import ch.bbw.exception.LoginException;

public class Benutzer {

    private String name;
    private String passwort;

    public Benutzer(String name, String passwort) {
        this.name = name;
        this.passwort = sha1(passwort);
    }

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

    public void login(String name, String passwort) throws LoginException {
        if (!this.name.equals(name) || !this.passwort.equals(sha1(passwort))) {
            throw new LoginException("Login fehlgeschlagen");
        }
    }
}
