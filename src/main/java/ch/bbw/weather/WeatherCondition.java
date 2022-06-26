package ch.bbw.weather;

public class WeatherCondition {
    
    private int temperature;
    private int rainfall;
    private int humidity;

    public WeatherCondition(int temperature, int rainfall, int humidity) {
        this.temperature = temperature;
        this.rainfall = rainfall;
        this.humidity = humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getRainfall() {
        return rainfall;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setRainfall(int rainfall) {
        this.rainfall = rainfall;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public String toString() {
        return "\tWeatherCondition \n" + "\t\tTemperature: " + temperature + "\n" + "\t\tRainfall: " + rainfall + "\n"
                + "\t\tHumidity: " + humidity;
    }

}
