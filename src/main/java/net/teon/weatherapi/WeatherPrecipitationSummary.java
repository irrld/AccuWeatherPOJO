package net.teon.weatherapi;

@lombok.Getter
public class WeatherPrecipitationSummary {
    private WeatherUnitDatas Precipitation;
    private WeatherUnitDatas PastHour;
    private WeatherUnitDatas Past3Hours;
    private WeatherUnitDatas Past6Hours;
    private WeatherUnitDatas Past9Hours;
    private WeatherUnitDatas Past12Hours;
    private WeatherUnitDatas Past18Hours;
    private WeatherUnitDatas Past24Hours;
}

