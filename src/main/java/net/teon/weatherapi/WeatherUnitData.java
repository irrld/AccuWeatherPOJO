package net.teon.weatherapi;

public class WeatherUnitData {
    private double Value;
    private String Unit;
    private int UnitType;

    public WeatherUnitData(double value, String unit, int unitType) {
        Value = value;
        Unit = unit;
        UnitType = unitType;
    }

    public double getValue() {
        return Value;
    }

    public String getUnit() {
        return Unit;
    }

    public int getUnitType() {
        return UnitType;
    }
}
