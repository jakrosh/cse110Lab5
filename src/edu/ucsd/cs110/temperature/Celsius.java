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
        return new Fahrenheit((getValue() * ((float)9/5) + 32));
    }

    public String toString()
    {
        // TODO: Complete this method
        String beginning = "" + getValue();
        String ending = " C";
        return beginning + ending;
    }
}