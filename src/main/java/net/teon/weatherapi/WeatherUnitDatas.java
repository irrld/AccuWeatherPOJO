package net.teon.weatherapi;

public class WeatherUnitDatas {
    private WeatherUnitData Metric;
    private WeatherUnitData Imperial;

    public WeatherUnitDatas(WeatherUnitData metric, WeatherUnitData imperial) {
        Metric = metric;
        Imperial = imperial;
    }

    public WeatherUnitData getMetric() {
        return Metric;
    }

    public WeatherUnitData getImperial() {
        return Imperial;
    }
}
