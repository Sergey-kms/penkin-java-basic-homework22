package ru.penkin.java.basic.homework22;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {      // vetka1_dz22

    @Test
    public void testGetElementsAfterLastOne() {
        int[] array1 = {1, 2, 1, 2, 2};
        assertArrayEquals(new int[]{2, 2}, ArrayUtils.getElementsAfterLastOne(array1));

        int[] array2 = {2, 2, 2, 2};
        try {
            ArrayUtils.getElementsAfterLastOne(array2);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Input array does not contain any ones", e.getMessage());
        }

    }

    @Test
    public void testIsValidArray() {
        int[] validArray = {1, 2, 1, 2, 2};
        assertTrue(ArrayUtils.isValidArray(validArray));

        int[] invalidArray1 = {1, 1};
        assertFalse(ArrayUtils.isValidArray(invalidArray1));

        int[] invalidArray2 = {1, 3};
        assertFalse(ArrayUtils.isValidArray(invalidArray2));

        int[] validArray2 = {1, 2, 2, 1};
        assertTrue(ArrayUtils.isValidArray(validArray2));
    }
}