package ch.bbw.app;

import java.util.ArrayList;

import ch.bbw.user.UserController;
import ch.bbw.weather.Weather;

public class WebApp {

    private UserController userController;
    private ArrayList<Weather> weatherList;

    public WebApp() {
        userController = new UserController();
        weatherList = new ArrayList<>();
    }

    public UserController getUserController() {
        return userController;
    }

    public ArrayList<Weather> getWeatherList() {
        return weatherList;
    }

    public void addWeather(String place, String day, String weatherCondition, int temperature, int humidity, int rainfall,
            int windspeed, int winddirection) {
        weatherList.add(new Weather(place, day, weatherCondition, temperature, humidity, rainfall, windspeed,
                winddirection));
    }

    public void displayWeather() {
        for (Weather weather : weatherList) {
            System.out.println(weather.toString());
        }
    }
    
}
