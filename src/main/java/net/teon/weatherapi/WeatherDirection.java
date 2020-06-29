package net.teon.weatherapi;

public class WeatherDirection {
    private int Degrees;
    private String Localized;
    private String English;

    public WeatherDirection(int degrees, String localized, String english) {
        Degrees = degrees;
        Localized = localized;
        English = english;
    }

    public int getDegrees() {
        return Degrees;
    }

    public String getLocalized() {
        return Localized;
    }

    public String getEnglish() {
        return English;
    }
}
