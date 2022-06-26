package ch.bbw.weather;

public class Description {
    
    private String place;
    private String day;
    private String weatherCondition;

    public Description(String place, String day, String weatherCondition) {
        this.place = place;
        this.day = day;
        this.weatherCondition = weatherCondition;
    }

    public String getPlace() {
        return place;
    }

    public String getDay() {
        return day;
    }

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }
    
}
