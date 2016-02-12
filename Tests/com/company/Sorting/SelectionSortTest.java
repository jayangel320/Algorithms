package com.company.Sorting;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * Created by jaybob320 on 2/11/16.
 */
public class SelectionSortTest {
    private int[] testArray = {1,5,4,3};
    private SelectionSort ss;

    @Before
    public void setUp() throws Exception {
        ss = new SelectionSort(testArray);
    }

    @Test
    public void isArrayInAscOrder()throws Exception{
        int[] testArray = ss.sortAsc();
        for(int counter = 0; counter < Array.getLength(testArray) - 1; counter++) {
            if (testArray[counter] > testArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }
}