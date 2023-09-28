package me.bnnq.services;

import me.bnnq.enums.SortDirection;
import me.bnnq.services.abstractions.IArraySorter;

public class BubbleArraySorter implements IArraySorter
{
    @Override
    public void sortArray(int[] array, SortDirection direction)
    {
        switch (direction) {
            case Ascending -> {
                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] > array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
            case Descending -> {
                for (int i = 0; i < array.length; i++) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] < array[j]) {
                            int temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                        }
                    }
                }
            }
        }
    }
}
