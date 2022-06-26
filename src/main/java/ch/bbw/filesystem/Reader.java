package ch.bbw.filesystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import ch.bbw.app.WebApp;
import ch.bbw.user.Admin;
import ch.bbw.user.User;
import ch.bbw.user.UserController;

public class Reader {
    
    private WebApp app;
    private UserController userController;

    public Reader(WebApp app) {
        userController = app.getUserController();
        this.app = app;
    }

    public void readFile() {
        JSONParser parser = new JSONParser();
        try {
            Object weatherList = parser.parse(new FileReader("src/main/java/ch/bbw/filesystem/weather.json"));
            Object userList = parser.parse(new FileReader("src/main/java/ch/bbw/filesystem/users.json"));

            JSONArray weatherArray = (JSONArray) weatherList;
            JSONArray userArray = (JSONArray) userList;

            for (int i = 0; i < weatherArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) weatherArray.get(i);
                String place = (String) jsonObject.get("place");
                String day = (String) jsonObject.get("day");
                String weatherCondition = (String) jsonObject.get("weatherCondition");
                int temperature = (int) jsonObject.get("temperature");
                int humidity = (int) jsonObject.get("humidity");
                int rainfall = (int) jsonObject.get("rainfall");
                int windspeed = (int) jsonObject.get("windspeed");
                int winddirection = (int) jsonObject.get("winddirection");
                app.addWeather(place, day, weatherCondition, temperature, humidity, rainfall, windspeed,
                        winddirection);
            }

            for (int i = 0; i < userArray.size(); i++) {
                JSONObject jsonObject = (JSONObject) userArray.get(i);
                String username = (String) jsonObject.get("username");
                String password = (String) jsonObject.get("password");
                Boolean role = ((role = (Boolean) jsonObject.get("isAdmin")) != null) ? role : false;
                if (role) {
                    userController.add(new Admin(username, password, userController));
                } else {
                    userController.add(new User(username, password, userController));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
