package ch.bbw.weather;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * class that holds the description of the weather
 */
public class Description {
    
    private String place;
    private String day;
    private String weatherCondition;

    /**
     * constructor
     * @param place of the weather
     * @param day of the weather
     * @param weatherCondition of the weather
     */
    public Description(String place, String day, String weatherCondition) {
        this.place = place;
        this.day = day;
        this.weatherCondition = weatherCondition;
    }

    /**
     * get the place of the weather
     * @return the place
     */
    public String getPlace() {
        return place;
    }

    /**
     * get the day of the weather
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * get the weather condition of the weather
     * @return the weatherCondition
     */
    public String getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * set the place of the weather
     * @param place of the weather
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * set the day of the weather
     * @param day of the weather
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * set the weather condition of the weather
     * @param weatherCondition of the weather
     */
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    /**
     * override toString
     * @return the description
     */
    @Override
    public String toString() {
        return "\tDescription \n" + "\t\tPlace: " + place + "\n" + "\t\tDay: " + day + "\n" + "\t\tWeather Condition: " + weatherCondition;
    }
    
}
