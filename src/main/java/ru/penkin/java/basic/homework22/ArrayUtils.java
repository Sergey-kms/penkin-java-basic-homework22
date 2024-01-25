package ru.penkin.java.basic.homework22;

public class ArrayUtils {      // vetka1_dz22_test

    public static int[] getElementsAfterLastOne(int[] array) {
        boolean foundOne = false;
        int lastOneIndex = -1;

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 1) {
                foundOne = true;
                lastOneIndex = i;
                break;
            }
        }

        if (!foundOne) {
            throw new RuntimeException("Input array does not contain any ones");
        }

        int elementsAfterLastOneCount = array.length - lastOneIndex - 1;
        int[] result = new int[elementsAfterLastOneCount];

        for (int i = 0; i < elementsAfterLastOneCount; i++) {
            result[i] = array[lastOneIndex + 1 + i];
        }

        return result;
    }

    public static boolean isValidArray(int[] array) {
        boolean containsOne = false;
        boolean containsTwo = false;

        for (int num : array) {
            if (num != 1 && num != 2) {
                return false;
            }

            if (num == 1) {
                containsOne = true;
            } else if (num == 2) {
                containsTwo = true;
            }
        }

        return containsOne && containsTwo;
    }
}