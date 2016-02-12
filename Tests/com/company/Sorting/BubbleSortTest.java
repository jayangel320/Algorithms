package com.company.Sorting;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * Created by jaybob320 on 2/11/16.
 */
public class BubbleSortTest {
    private int[] testArray = {1,5,4,3};
    private BubbleSort bs;

    @Before
    public void setUp() throws Exception {
        bs = new BubbleSort(testArray);
    }


    @Test
    public void isArrayInAscOrder()throws Exception{
        int[] testArray = bs.sortAsc();
        for(int counter = 0; counter < Array.getLength(testArray) - 1; counter++) {
            if (testArray[counter] > testArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Test
    public void isArrayInDescOrder()throws Exception{
        int[] testArray = bs.sortDesc();
        for(int counter = 0; counter < Array.getLength(testArray) - 1; counter++) {
            if (testArray[counter] < testArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }
}