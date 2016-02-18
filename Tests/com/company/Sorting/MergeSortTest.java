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
    public void sortAsc() throws Exception{
        int[] array = {7,1,6,3,8,0,4,6,2};
        MergeSort.sortAsc(array);

        for (int counter = 0; counter < Array.getLength(array) - 1; counter++) {
            if (array[counter] > array[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }

    }



    @Test
    public void testMergeArraysAsc() throws Exception {
        int[] array = {1, 3, 5, 6, 0, 2, 4, 6};
        MergeSort.mergeArraysAsc(array,0,3,7);

        for (int counter = 0; counter < Array.getLength(array) - 1; counter++) {
            if (array[counter] > array[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Test
    public void testMergeArraysDesc() throws Exception {
        int[] array = {6,5,3,1,6,4,2,0};
        MergeSort.mergeArraysDesc(array,0,3,7);

        for(int counter = 0; counter < Array.getLength(array) - 1; counter++) {
            if (array[counter] < array[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }
}