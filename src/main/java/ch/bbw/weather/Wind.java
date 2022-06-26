package ch.bbw.weather;

public class Wind {
    private int windspeed;
    private int winddirection;
    
    public Wind(int windspeed, int winddirection) {
        this.windspeed = windspeed;
        this.winddirection = winddirection;
    }

    public int getWindspeed() {
        return windspeed;
    }

    public int getWinddirection() {
        return winddirection;
    }

    public void setWindspeed(int windspeed) {
        this.windspeed = windspeed;
    }

    public void setWinddirection(int winddirection) {
        this.winddirection = winddirection;
    }

    @Override
    public String toString() {
        return "\tWind \n" + "\t\tWindspeed: " + windspeed + "\n" + "\t\tWinddirection: " + winddirection;
    }
}
