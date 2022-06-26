package ch.bbw.filesystem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import ch.bbw.app.WebApp;
import ch.bbw.user.User;
import ch.bbw.user.UserController;
import ch.bbw.weather.Weather;

public class Writer {
    
    private ArrayList<Weather> weatherList;
    private UserController userController;

    public Writer(WebApp app) {
        userController = app.getUserController();
        weatherList = app.getWeatherList();
    }

    public void writeFile() {
        JSONArray weatherArray = new JSONArray();
        JSONArray userArray = new JSONArray();
        for (Weather weather : weatherList) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("place", weather.getDescription().getPlace());
            jsonObject.put("day", weather.getDescription().getDay());
            jsonObject.put("weatherCondition", weather.getDescription().getWeatherCondition());
            jsonObject.put("temperature", weather.getWeatherCondition().getTemperature());
            jsonObject.put("humidity", weather.getWeatherCondition().getHumidity());
            jsonObject.put("rainfall", weather.getWeatherCondition().getRainfall());
            jsonObject.put("windspeed", weather.getWind().getWindspeed());
            jsonObject.put("winddirection", weather.getWind().getWinddirection());
            weatherArray.put(jsonObject);
        }
        for (User user : userController.getUsers()) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("username", user.getName());
            jsonObject.put("password", user.getPassword());
            jsonObject.put("isAdmin", user.isAdmin());
            userArray.put(jsonObject);
        }

        try {
            FileWriter weatherWriter = new FileWriter("src/main/java/ch/bbw/filesystem/weather.json");
            FileWriter userWriter = new FileWriter("src/main/java/ch/bbw/filesystem/users.json");
            weatherWriter.write(weatherArray.toString());
            userWriter.write(userArray.toString());
            weatherWriter.flush();
            userWriter.flush();
            weatherWriter.close();
            userWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
