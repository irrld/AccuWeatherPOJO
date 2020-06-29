package net.teon.weatherapi;

@lombok.Getter
public class Weather {
    private String LocalObservationDateTime;
    private String EpochTime;
    private String WeatherText;
    private String WeatherIcon;
    private boolean HasPrecipitation;
    private String PrecipitationType;
    private boolean IsDayTime;
    private WeatherUnitDatas Temperature;
    private WeatherUnitDatas RealFeelTemperature;
    private WeatherUnitDatas RealFeelTemperatureShade;
    private int RelativeHumidity;
    private int IndoorRelativeHumidity;
    private WeatherUnitDatas DewPoint;
    private WeatherWindInformation Wind;
    private WeatherWindGust WindGust;
    private int UVIndex;
    private String UVIndexText;
    private WeatherUnitDatas Visibility;
    private String ObstructionsToVisibility;
    private int CloudCover;
    private WeatherUnitDatas Ceiling;
    private WeatherUnitDatas Pressure;
    private WeatherPressureTendency PressureTendency;
    private WeatherUnitDatas Past24HourTemperatureDeparture;
    private WeatherUnitDatas ApparentTemperature;
    private WeatherUnitDatas WindChillTemperature;
    private WeatherUnitDatas WetBulbTemperature;
    private WeatherUnitDatas Precip1hr;
    private WeatherPrecipitationSummary PrecipitationSummary;
    private WeatherRanges TemperatureSummary;
    private String MobileLink;
    private String Link;
}
