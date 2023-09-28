package me.bnnq.utilities;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerUtilities {
    private static Scanner scanner = new Scanner(System.in);

    public static int scanInt() {
        return scanner.nextInt();
    }

    public static double scanDouble() {
        return scanner.nextDouble();
    }

    public static String scanString() {
        return scanner.next();
    }

    public static char scanChar() {
        return scanner.next().charAt(0);
    }

    public static int[] scanIntArray(int numberOfElements) {
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.printf("Enter #%d element: ", i + 1);
            array[i] = scanner.nextInt();
        }

        return array;
    }

    /**
     * @param stream The stream to change to (default is System.in)
     */
    public static void changeStream(InputStream stream) {
        scanner = new Scanner(stream);
    }
}
