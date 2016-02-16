package com.company.Sorting;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

/**
 * Created by jaybob320 on 2/16/16.
 */
public class QuickSortTest {

    private int[] testArray = {1,5,4,3,-1};


    @Test
    public void isArrayInDescOrder()throws Exception{
       QuickSort.sortDesc(testArray,0,testArray.length - 1);
        for(int counter = 0; counter < Array.getLength(testArray) - 1; counter++) {
            if (testArray[counter] < testArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Test
    public void isArrayInAscOrder()throws Exception{
        QuickSort.sortAsc(testArray,0,testArray.length - 1);
        for(int counter = 0; counter < Array.getLength(testArray) - 1; counter++) {
            if (testArray[counter] > testArray[counter + 1]) {
                throw new IllegalArgumentException();
            }
        }
    }


}