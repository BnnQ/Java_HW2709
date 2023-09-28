package me.bnnq;

import me.bnnq.enums.Direction;
import me.bnnq.enums.SortDirection;
import me.bnnq.utilities.*;

@SuppressWarnings("unused")
public class Main
{
    public static void main(String[] args)
    {
        twelveTask();
    }

    public static void firstTask()
    {
        String[] parts = new String[]{"\"Your time is limited,", "so don’t waste it", "living someone else’s life\"", "Steve Jobs"};
        for (int i = 0; i < parts.length; i++)
        {
            System.out.println("\t".repeat(2 * i) + parts[i]);
        }
    }

    public static void secondTask()
    {
        System.out.print("Enter a number: ");
        double number = ScannerUtilities.scanDouble();

        System.out.print("Enter a percent: ");
        double percent = ScannerUtilities.scanDouble();

        System.out.printf("%.2f%% of %.2f is %.2f\n", percent, number, Calculator.percentFromNumber(number, percent));
    }

    @SuppressWarnings("UnnecessaryCallToStringValueOf")
    public static void thirdTask()
    {
        System.out.print("Enter a first number: ");
        int firstNumber = ScannerUtilities.scanInt();

        System.out.print("Enter a second number: ");
        int secondNumber = ScannerUtilities.scanInt();

        System.out.print("Enter a third number: ");
        int thirdNumber = ScannerUtilities.scanInt();

        int wholeNumber = Integer.parseInt(Integer.toString(firstNumber) + Integer.toString(secondNumber) + Integer.toString(thirdNumber));

        System.out.printf("Entered number: %d", wholeNumber);
    }

    public static void fourthTask()
    {
        System.out.print("Enter a six digit number: ");
        int sixDigitNumber = ScannerUtilities.scanInt();
        if (sixDigitNumber < 100000 || sixDigitNumber > 999999)
        {
            System.err.println("Number must be 6 digits long");
            return;
        }

        String sixDigitNumberString = String.valueOf(sixDigitNumber);
        String swappedNumbers = String.valueOf(sixDigitNumberString.charAt(5)) + sixDigitNumberString.charAt(4) + sixDigitNumberString.substring(2, 4) + sixDigitNumberString.charAt(1) + sixDigitNumberString.charAt(0);

        System.out.printf("Swapped number: %s", swappedNumbers);
    }

    public static void fifthTask() {
        System.out.print("Enter a month number (1-12): ");
        int monthNumber = ScannerUtilities.scanInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.err.println("Month number must be between 1 and 12");
            return;
        }

        System.out.printf("Current season: %s", switch (monthNumber) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Unknown";
        });
    }

    public static void sixthTask() {
        System.out.print("Enter meters: ");
        double meters = ScannerUtilities.scanDouble();

        System.out.print("Select unit: (y - yards, i - inches, m - miles): ");
        char unit = ScannerUtilities.scanChar();

        switch (unit) {
            case 'y' -> System.out.printf("%.2f meters is %.2f yards", meters, UnitConverter.metersToYards(meters));
            case 'i' -> System.out.printf("%.2f meters is %.2f inches", meters, UnitConverter.metersToInches(meters));
            case 'm' -> System.out.printf("%.2f meters is %.2f miles", meters, UnitConverter.metersToMiles(meters));
            default -> System.err.println("Unknown unit");
        }

    }

    public static void seventhTask() {
        System.out.print("Enter a left bound: ");
        int leftBound = ScannerUtilities.scanInt();

        System.out.print("Enter a right bound: ");
        int rightBound = ScannerUtilities.scanInt();

        var range = NumberUtilities.normalizeRange(leftBound, rightBound);
        leftBound = range[0];
        rightBound = range[1];

        System.out.println("All odd numbers in range: ");
        for (int i = 0; i < rightBound; i++) {
            if (NumberUtilities.isOdd(i)) {
                System.out.printf("%d ", i);
            }
        }

    }

    public static void eighthTask() {
        System.out.print("Enter a number: ");
        int number = ScannerUtilities.scanInt();

        System.out.printf("Number %d is %s", number, NumberUtilities.isEven(number) ? "even" : "odd");
    }

    public static void ninthTask() {
        System.out.print("Enter a left bound: ");
        int leftBound = ScannerUtilities.scanInt();

        System.out.print("Enter a right bound: ");
        int rightBound = ScannerUtilities.scanInt();

        var range = NumberUtilities.normalizeRange(leftBound, rightBound);
        leftBound = range[0];
        rightBound = range[1];

        for (int i = leftBound; i <= rightBound; i++) {
            for (int j = 2; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }

    public static void tenthTask() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((10 - (-10)) + 1)) + (-10);
        }

        int[] evenArray = new int[10];
        int evenArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (NumberUtilities.isEven(array[i])) {
                evenArray[evenArrayIndex] = array[i];
                evenArrayIndex++;
            }
        }
        int[] evenArrayTrimmed = new int[evenArrayIndex];
        System.arraycopy(evenArray, 0, evenArrayTrimmed, 0, evenArrayIndex);

        int[] oddArray = new int[10];
        int oddArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (NumberUtilities.isOdd(array[i])) {
                oddArray[oddArrayIndex] = array[i];
                oddArrayIndex++;
            }
        }
        int[] oddArrayTrimmed = new int[oddArrayIndex];
        System.arraycopy(oddArray, 0, oddArrayTrimmed, 0, oddArrayIndex);

        int[] negativeArray = new int[10];
        int negativeArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeArray[negativeArrayIndex] = array[i];
                negativeArrayIndex++;
            }
        }
        int[] negativeArrayTrimmed = new int[negativeArrayIndex];
        System.arraycopy(negativeArray, 0, negativeArrayTrimmed, 0, negativeArrayIndex);

        int[] positiveArray = new int[10];
        int positiveArrayIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveArray[positiveArrayIndex] = array[i];
                positiveArrayIndex++;
            }
        }
        int[] positiveArrayTrimmed = new int[positiveArrayIndex];
        System.arraycopy(positiveArray, 0, positiveArrayTrimmed, 0, positiveArrayIndex);

        ArrayUtilities.printArray(array, "original");
        ArrayUtilities.printArray(evenArrayTrimmed, "even");
        ArrayUtilities.printArray(oddArrayTrimmed, "odd");
        ArrayUtilities.printArray(negativeArrayTrimmed, "negative");
        ArrayUtilities.printArray(positiveArrayTrimmed, "positive");
    }

    public static void printLine(Direction direction, int length, char symbol)
    {
        switch (direction)
        {
            case Vertical ->
            {
                for (int i = 0; i < length; i++)
                {
                    System.out.println(symbol);
                }
            }
            case Horizontal -> System.out.println(String.valueOf(symbol).repeat(length));
        }
    }

    public static void twelveTask()
    {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * ((10 - (-10)) + 1)) + (-10);
        }

        ArrayUtilities.printArray(array, "random unsorted");

        System.out.print("Choose a sort direction: (a - ascending, d - descending): ");
        char direction = ScannerUtilities.scanChar();

        switch (direction)
        {
            case 'a' -> ArrayUtilities.sortArray(array, SortDirection.Ascending);
            case 'd' -> ArrayUtilities.sortArray(array, SortDirection.Descending);
            default -> System.err.println("Unknown direction");
        }

        ArrayUtilities.printArray(array, "sorted");
    }


}