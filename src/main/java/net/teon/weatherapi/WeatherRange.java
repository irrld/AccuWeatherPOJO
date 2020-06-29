package net.teon.weatherapi;

public class WeatherRange {
    private WeatherUnitDatas Minimum;
    private WeatherUnitDatas Maximum;

    public WeatherRange(WeatherUnitDatas minimum, WeatherUnitDatas maximum) {
        Minimum = minimum;
        Maximum = maximum;
    }

    public WeatherUnitDatas getMinimum() {
        return Minimum;
    }

    public WeatherUnitDatas getMaximum() {
        return Maximum;
    }
}
