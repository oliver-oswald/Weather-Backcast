package ch.bbw.weather;

public class Weather {
    
    private WeatherCondition weatherCondition;
    private Description description;
    private Wind wind;

    public Weather(String place, String day, String weatherCondition, int temperature, int humidity, int rainfall,
            int windspeed, int winddirection) {
        this.description = new Description(place, day, weatherCondition);
        this.weatherCondition = new WeatherCondition(temperature, rainfall, humidity);
        this.wind = new Wind(windspeed, winddirection);
    }
    
    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    public Description getDescription() {
        return description;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }
}
