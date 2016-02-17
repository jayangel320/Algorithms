package com.company.Reverse;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by jaybob320 on 2/17/16.
 */
public class ReverseTest {

    @Test
    public void testReverse() throws Exception {
        int[] array1 = {1,4,5,6,7,8,9};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        int revCount = array1.length - 1;
        Reverse.Reverse(array1);
        for(int counter = 0; counter < Array.getLength(array1); counter++) {
            if(array1[counter] != array2[revCount--]) {
                throw new IllegalArgumentException();
            }
        }
    }
}