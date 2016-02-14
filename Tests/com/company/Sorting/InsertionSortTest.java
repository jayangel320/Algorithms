package com.company.Sorting;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * Created by jaybob320 on 2/14/16.
 */
public class InsertionSortTest {

    private int[] testArray = {1,5,4,3};
    private InsertionSort is;

    @Before
    public void setUp() throws Exception {
        is = new InsertionSort(testArray);
    }


    @Test
    public void isArrayInDescOrder()throws Exception{
        int[] testArray = is.sortDesc();
        for(int counter = 0; counter < Array.getLength(testArray) - 1; counter++) {
            if (testArray[counter] < testArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Test
    public void isArrayInAscOrder()throws Exception{
        int[] testArray = is.sortAsc();
        for(int counter = 0; counter < Array.getLength(testArray) - 1; counter++) {
            if (testArray[counter] > testArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }

}