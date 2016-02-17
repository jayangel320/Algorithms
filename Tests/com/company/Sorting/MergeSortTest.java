package com.company.Sorting;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * Created by jaybob320 on 2/17/16.
 */
public class MergeSortTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMergeArraysAsc() throws Exception {
        int[] array1 = {1, 3, 5, 6};
        int[] array2 = {0, 2, 4, 6};
        int[] mergeArray = MergeSort.mergeArraysAsc(array1, array2);

        for (int counter = 0; counter < Array.getLength(mergeArray) - 1; counter++) {
            if (mergeArray[counter] > mergeArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Test
    public void testMergeArraysDesc() throws Exception {
        int[] array1 = {6,5,3,1};
        int[] array2 = {6,4,2,0};
        int[] mergeArray = MergeSort.mergeArraysDesc(array1,array2);

        for(int counter = 0; counter < Array.getLength(mergeArray) - 1; counter++) {
            if (mergeArray[counter] < mergeArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }
}