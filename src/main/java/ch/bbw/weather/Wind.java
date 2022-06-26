package ch.bbw.weather;

/**
 * @author Oliver Oswald
 * @version 1.0
 * @since 1.0
 */

/**
 * class that holds wind data about the weather
 */
public class Wind {
    private int windspeed;
    private int winddirection;
    
    /**
     * constructor
     * @param windspeed of the weather
     * @param winddirection of the weather
     */
    public Wind(int windspeed, int winddirection) {
        this.windspeed = windspeed;
        this.winddirection = winddirection;
    }

    /**
     * get the windspeed of the weather
     * @return the windspeed
     */
    public int getWindspeed() {
        return windspeed;
    }

    /**
     * get the winddirection of the weather
     * @return the winddirection
     */
    public int getWinddirection() {
        return winddirection;
    }

    /**
     * set the windspeed of the weather
     * @param windspeed of the weather
     */
    public void setWindspeed(int windspeed) {
        this.windspeed = windspeed;
    }

    /**
     * set the winddirection of the weather
     * @param winddirection of the weather
     */
    public void setWinddirection(int winddirection) {
        this.winddirection = winddirection;
    }

    /**
     * get the windspeed of the weather
     * @return the windspeed
     */
    @Override
    public String toString() {
        return "\tWind \n" + "\t\tWindspeed: " + windspeed + "\n" + "\t\tWinddirection: " + winddirection;
    }
}
