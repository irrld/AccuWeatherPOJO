package net.teon.weatherapi;

public class WeatherPrecipitationSummary {
    private WeatherUnitDatas Precipitation;
    private WeatherUnitDatas PastHour;
    private WeatherUnitDatas Past3Hours;
    private WeatherUnitDatas Past6Hours;
    private WeatherUnitDatas Past9Hours;
    private WeatherUnitDatas Past12Hours;
    private WeatherUnitDatas Past18Hours;
    private WeatherUnitDatas Past24Hours;

    public WeatherPrecipitationSummary(WeatherUnitDatas precipitation, WeatherUnitDatas pastHour, WeatherUnitDatas past3Hours, WeatherUnitDatas past6Hours, WeatherUnitDatas past9Hours, WeatherUnitDatas past12Hours, WeatherUnitDatas past18Hours, WeatherUnitDatas past24Hours) {
        Precipitation = precipitation;
        PastHour = pastHour;
        Past3Hours = past3Hours;
        Past6Hours = past6Hours;
        Past9Hours = past9Hours;
        Past12Hours = past12Hours;
        Past18Hours = past18Hours;
        Past24Hours = past24Hours;
    }

    public WeatherUnitDatas getPrecipitation() {
        return Precipitation;
    }

    public WeatherUnitDatas getPastHour() {
        return PastHour;
    }

    public WeatherUnitDatas getPast3Hours() {
        return Past3Hours;
    }

    public WeatherUnitDatas getPast6Hours() {
        return Past6Hours;
    }

    public WeatherUnitDatas getPast9Hours() {
        return Past9Hours;
    }

    public WeatherUnitDatas getPast12Hours() {
        return Past12Hours;
    }

    public WeatherUnitDatas getPast18Hours() {
        return Past18Hours;
    }

    public WeatherUnitDatas getPast24Hours() {
        return Past24Hours;
    }
}

