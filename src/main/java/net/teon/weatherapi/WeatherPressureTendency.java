package net.teon.weatherapi;

public class WeatherPressureTendency {
    private String LocalizedText;
    private String Code;

    public WeatherPressureTendency(String localizedText, String code) {
        LocalizedText = localizedText;
        Code = code;
    }

    public String getLocalizedText() {
        return LocalizedText;
    }

    public String getCode() {
        return Code;
    }
}
