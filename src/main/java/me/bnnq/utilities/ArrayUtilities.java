package me.bnnq.utilities;

import me.bnnq.enums.SortDirection;
import me.bnnq.services.BubbleArraySorter;
import me.bnnq.services.abstractions.IArraySorter;

public class ArrayUtilities
{
    public static void printArray(int[] array, String arrayName)
    {
        System.out.print("Elements of " + arrayName + " array: ");
        for (int element : array)
        {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void sortArray(int[] array, SortDirection direction) {
        IArraySorter sorter = new BubbleArraySorter();
        sorter.sortArray(array, direction);
    }

}
