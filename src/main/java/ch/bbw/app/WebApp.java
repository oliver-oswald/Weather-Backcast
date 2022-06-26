package ch.bbw.app;

import java.util.ArrayList;

import ch.bbw.user.UserController;
import ch.bbw.weather.Weather;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * class that handels the data
 */
public class WebApp {

    private UserController userController;
    private ArrayList<Weather> weatherList;

    /**
     * constructor
     */
    public WebApp() {
        userController = new UserController();
        weatherList = new ArrayList<>();
    }

    /**
     * get the user controller
     * @return the userController
     */
    public UserController getUserController() {
        return userController;
    }

    /**
     * get the weather list
     * @return the weatherList
     */
    public ArrayList<Weather> getWeatherList() {
        return weatherList;
    }

    /**
     * add a weather to the list
     * @param place of the weather
     * @param day of the weather
     * @param weatherCondition of the weather
     * @param temperature of the weather
     * @param humidity of the weather
     * @param rainfall of the weather
     * @param windspeed of the weather
     * @param winddirection of the weather
     */
    public void addWeather(String place, String day, String weatherCondition, int temperature, int humidity, int rainfall,
            int windspeed, int winddirection) {
        weatherList.add(new Weather(place, day, weatherCondition, temperature, humidity, rainfall, windspeed,
                winddirection));
    }

    /**
     * displays the weather information
     */
    public void displayWeather() {
        for (Weather weather : weatherList) {
            System.out.println(weather.toString());
        }
    }
    
}
