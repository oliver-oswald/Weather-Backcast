package ch.bbw.app;

import java.util.Scanner;

import ch.bbw.exception.LoginException;
import ch.bbw.exception.RegisterException;
import ch.bbw.exception.UserNotFoundException;
import ch.bbw.filesystem.Reader;
import ch.bbw.filesystem.Writer;
import ch.bbw.user.User;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * the main class of the application
 */
public class App 
{

    /**
     * the sole constructor
     */
    public App() {
    }
    
    /** 
     * the main function of the application
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        String mode = "";
        boolean registered = false;

        String menu = "to register press r \nto login press l\nto exit press e";
        String menu2 = "to see the weather press w\nto add the weather press a\nto sign out press e";

        WebApp app = new WebApp();
        User user = new User(app.getUserController());
        Writer writer = new Writer(app);
        Reader reader = new Reader(app);
        
        reader.readFile();

        System.out.println("Welcome to the Weather App!");
        System.out.println("                   \\       /            _\\/_");
        System.out.println("                     .-'-.              //o\\  _\\/_");
        System.out.println("  _  ___  __  _ --_ /     \\ _--_ __  __ _ |  __/o\\ _");
        System.out.println("=-=-_=-=-_=-=_=-_= -=======- = =-=_=-=_,-\'|\"\'\"\"-|-,_ ");
        System.out.println(" =- _=-=-_=- _=-= _--=====- _=-=_-_,-\"          |"); 
        System.out.println("jgs=- =- =-= =- = -  -===- -= - .");
        System.out.println("====================================================");
        System.out.println(menu);
        while ((mode = in.nextLine()).equals("e") == false) {
            switch (mode) {
                case "r":
                    System.out.println("Please enter your username: ");
                    String username = in.nextLine();
                    System.out.println("Please enter your password: ");
                    String password = in.nextLine();
                    try {
                        user.register(username, password);
                        registered = true;
                        System.out.println("You have successfully registered!");
                    } catch (RegisterException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    break;
                case "l":
                    System.out.println("Please enter your username: ");
                    username = in.nextLine();
                    System.out.println("Please enter your password: ");
                    password = in.nextLine();
                    try {
                        user = app.getUserController().getUser(username);
                        user.login(username, password);
                        registered = true;
                        System.out.println("You have successfully logged in!");
                    } catch (LoginException e) {
                        System.out.println(e.getMessage());
                        break;
                    } catch (UserNotFoundException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            while (registered) {
                System.out.println(menu2);
                mode = in.nextLine();
                switch (mode) {
                    case "w":
                        app.displayWeather();
                        break;
                    case "a":
                        if (user.isAdmin()) {
                            
                            System.out.println("Please enter the place: ");
                            String place = in.nextLine();
                            System.out.println("please enter the day");
                            String day = in.nextLine();
                            System.out.println("please enter the weather condition");
                            String weatherCondition = in.nextLine();
                            System.out.println("please enter the temperature");
                            int temperature = in.nextInt();
                            System.out.println("please enter the humidity");
                            int humidity = in.nextInt();
                            System.out.println("please enter the rainfall");
                            int rainfall = in.nextInt();
                            System.out.println("please enter the windspeed");
                            int windspeed = in.nextInt();
                            System.out.println("please enter the winddirection");
                            int winddirection = in.nextInt();
                            app.addWeather(place, day, weatherCondition, temperature, humidity, rainfall, windspeed,
                            winddirection);
                        } else {
                            System.out.println("You are not an admin");
                        }
                        break;
                    case "e":
                        registered = false;
                        break;
                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
            System.out.println(menu);
        }

        writer.writeFile();
        in.close();
    }
}
