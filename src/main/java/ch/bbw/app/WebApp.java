package ch.bbw.app;

import java.util.ArrayList;

import ch.bbw.user.Admin;
import ch.bbw.user.User;

public class WebApp {
    private ArrayList<User> benutzer;
    private ArrayList<Admin> admin;

    public WebApp() {
        admin = new ArrayList<Admin>();
        benutzer = new ArrayList<User>();
    }
    
    public void addBenutzer(User b) {
        benutzer.add(b);
    }

    public void addAdmin(Admin a) {
        admin.add(a);
    }
    
}
