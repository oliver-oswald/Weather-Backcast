package ch.bbw.weather;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/** 
* class that holds the weather condition about the weather
*/
public class WeatherCondition {
    
    private int temperature;
    private int rainfall;
    private int humidity;

    /**
     * constructor
     * @param temperature of the weather
     * @param rainfall of the weather
     * @param humidity of the weather
     */
    public WeatherCondition(int temperature, int rainfall, int humidity) {
        this.temperature = temperature;
        this.rainfall = rainfall;
        this.humidity = humidity;
    }

    /**
     * get the temperature of the weather
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * get the rainfall of the weather
     * @return the rainfall
     */
    public int getRainfall() {
        return rainfall;
    }

    /**
     * get the humidity of the weather
     * @return the humidity
     */
    public int getHumidity() {
        return humidity;
    }

    /**
     * set the temperature of the weather
     * @param temperature of the weather
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * set the rainfall of the weather
     * @param rainfall of the weather
     */
    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }

    /**
     * set the humidity of the weather
     * @param humidity of the weather
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /**
     * toString method
     * @return the temperature, rainfall and humidity
     */
    @Override
    public String toString() {
        return "\tWeatherCondition \n" + "\t\tTemperature: " + temperature + "\n" + "\t\tRainfall: " + rainfall + "\n"
                + "\t\tHumidity: " + humidity;
    }

}
