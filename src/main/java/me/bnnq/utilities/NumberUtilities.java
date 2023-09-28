package me.bnnq.utilities;

public class NumberUtilities
{
    public static boolean isEven(int number)
    {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number)
    {
        return !isEven(number);
    }

    public static int[] normalizeRange(int firstBound, int secondBound) {
        int[] normalizedRange = new int[2];
        normalizedRange[0] = Math.min(firstBound, secondBound);
        normalizedRange[1] = Math.max(firstBound, secondBound);

        return normalizedRange;
    }

}
