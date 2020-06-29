package net.teon.weatherapi;

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

    public Weather(String localObservationDateTime, String epochTime, String weatherText, String weatherIcon, boolean hasPrecipitation, String precipitationType, boolean isDayTime, WeatherUnitDatas temperature, WeatherUnitDatas realFeelTemperature, WeatherUnitDatas realFeelTemperatureShade, int relativeHumidity, int indoorRelativeHumidity, WeatherUnitDatas dewPoint, WeatherWindInformation wind, WeatherWindGust windGust, int UVIndex, String UVIndexText, WeatherUnitDatas visibility, String obstructionsToVisibility, int cloudCover, WeatherUnitDatas ceiling, WeatherUnitDatas pressure, WeatherPressureTendency pressureTendency, WeatherUnitDatas past24HourTemperatureDeparture, WeatherUnitDatas apparentTemperature, WeatherUnitDatas windChillTemperature, WeatherUnitDatas wetBulbTemperature, WeatherUnitDatas precip1hr, WeatherPrecipitationSummary precipitationSummary, WeatherRanges temperatureSummary, String mobileLink, String link) {
        LocalObservationDateTime = localObservationDateTime;
        EpochTime = epochTime;
        WeatherText = weatherText;
        WeatherIcon = weatherIcon;
        HasPrecipitation = hasPrecipitation;
        PrecipitationType = precipitationType;
        IsDayTime = isDayTime;
        Temperature = temperature;
        RealFeelTemperature = realFeelTemperature;
        RealFeelTemperatureShade = realFeelTemperatureShade;
        RelativeHumidity = relativeHumidity;
        IndoorRelativeHumidity = indoorRelativeHumidity;
        DewPoint = dewPoint;
        Wind = wind;
        WindGust = windGust;
        this.UVIndex = UVIndex;
        this.UVIndexText = UVIndexText;
        Visibility = visibility;
        ObstructionsToVisibility = obstructionsToVisibility;
        CloudCover = cloudCover;
        Ceiling = ceiling;
        Pressure = pressure;
        PressureTendency = pressureTendency;
        Past24HourTemperatureDeparture = past24HourTemperatureDeparture;
        ApparentTemperature = apparentTemperature;
        WindChillTemperature = windChillTemperature;
        WetBulbTemperature = wetBulbTemperature;
        Precip1hr = precip1hr;
        PrecipitationSummary = precipitationSummary;
        TemperatureSummary = temperatureSummary;
        MobileLink = mobileLink;
        Link = link;
    }

    public String getLocalObservationDateTime() {
        return LocalObservationDateTime;
    }

    public String getEpochTime() {
        return EpochTime;
    }

    public String getWeatherText() {
        return WeatherText;
    }

    public String getWeatherIcon() {
        return WeatherIcon;
    }

    public boolean isHasPrecipitation() {
        return HasPrecipitation;
    }

    public String getPrecipitationType() {
        return PrecipitationType;
    }

    public boolean isDayTime() {
        return IsDayTime;
    }

    public WeatherUnitDatas getTemperature() {
        return Temperature;
    }

    public WeatherUnitDatas getRealFeelTemperature() {
        return RealFeelTemperature;
    }

    public WeatherUnitDatas getRealFeelTemperatureShade() {
        return RealFeelTemperatureShade;
    }

    public int getRelativeHumidity() {
        return RelativeHumidity;
    }

    public int getIndoorRelativeHumidity() {
        return IndoorRelativeHumidity;
    }

    public WeatherUnitDatas getDewPoint() {
        return DewPoint;
    }

    public WeatherWindInformation getWind() {
        return Wind;
    }

    public WeatherWindGust getWindGust() {
        return WindGust;
    }

    public int getUVIndex() {
        return UVIndex;
    }

    public String getUVIndexText() {
        return UVIndexText;
    }

    public WeatherUnitDatas getVisibility() {
        return Visibility;
    }

    public String getObstructionsToVisibility() {
        return ObstructionsToVisibility;
    }

    public int getCloudCover() {
        return CloudCover;
    }

    public WeatherUnitDatas getCeiling() {
        return Ceiling;
    }

    public WeatherUnitDatas getPressure() {
        return Pressure;
    }

    public WeatherPressureTendency getPressureTendency() {
        return PressureTendency;
    }

    public WeatherUnitDatas getPast24HourTemperatureDeparture() {
        return Past24HourTemperatureDeparture;
    }

    public WeatherUnitDatas getApparentTemperature() {
        return ApparentTemperature;
    }

    public WeatherUnitDatas getWindChillTemperature() {
        return WindChillTemperature;
    }

    public WeatherUnitDatas getWetBulbTemperature() {
        return WetBulbTemperature;
    }

    public WeatherUnitDatas getPrecip1hr() {
        return Precip1hr;
    }

    public WeatherPrecipitationSummary getPrecipitationSummary() {
        return PrecipitationSummary;
    }

    public WeatherRanges getTemperatureSummary() {
        return TemperatureSummary;
    }

    public String getMobileLink() {
        return MobileLink;
    }

    public String getLink() {
        return Link;
    }
}
