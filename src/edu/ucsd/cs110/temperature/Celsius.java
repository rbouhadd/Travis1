package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        float v = this.getValue();
        Temperature t = new Fahrenheit((float)(9.0/5.0)*v+32);
        return t;
    }

    public String toString()
    {
        return "" + this.getValue() + " C";
    }
}