package me.bnnq.utilities;

public class UnitConverter
{
    public static double MILES_IN_METER = 0.000621371;
    public static double metersToMiles(double meters)
    {
        return meters * MILES_IN_METER;
    }

    public static double INCHES_IN_METER = 39.3701;
    public static double metersToInches(double meters)
    {
        return meters * INCHES_IN_METER;
    }

    final static double YARDS_IN_METER = 1.09361;
    public static double metersToYards(double meters)
    {

        return meters * YARDS_IN_METER;
    }
}
