package ch.bbw.weather;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/** 
 * class that holds information about the weather
*/
 public class Weather {

    private WeatherCondition weatherCondition;
    private Description description;
    private Wind wind;

    /**
     * constructor
     * @param weatherCondition of the weather
     * @param description of the weather
     * @param wind of the weather
     */
    public Weather(String place, String day, String weatherCondition, int temperature, int humidity, int rainfall,
            int windspeed, int winddirection) {
        this.description = new Description(place, day, weatherCondition);
        this.weatherCondition = new WeatherCondition(temperature, rainfall, humidity);
        this.wind = new Wind(windspeed, winddirection);
    }
    
    /**
     * get the weather condition of the weather
     * @return the weatherCondition
     */
    public WeatherCondition getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * get the description of the weather
     * @return the description
     */
    public Description getDescription() {
        return description;
    }

    /**
     * get the wind of the weather
     * @return the wind
     */
    public Wind getWind() {
        return wind;
    }

    /**
     * set the weather condition of the weather
     * @param weatherCondition
     */
    public void setWeatherCondition(WeatherCondition weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    /**
     * set the description of the weather
     * @param description
     */
    public void setDescription(Description description) {
        this.description = description;
    }

    /**
     * set the wind of the weather
     * @param wind
     */
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /**
     * override toString
     * @return the description
     */
    @Override
    public String toString() {
        return "Weather \n" + description.toString() + "\n" + weatherCondition.toString() + "\n" + wind.toString();
    }
}
