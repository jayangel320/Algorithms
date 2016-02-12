package com.company.Sorting;

import java.lang.reflect.Array;

/**
 * Created by jaybob320 on 2/11/16.
 */

//TODO: add explanation of Insertion Sort
public class InsertionSort {




    private int[] dataArray;
    private int length;

    public InsertionSort(int[] dataArray) {
        this.dataArray = dataArray;
        this.length = Array.getLength(dataArray);
    }

//TODO: Add a sortAsc

//TODO: Add a lot of description to this
    public void sortDesc( int [ ] num)
    {
        //The number that has been sorted so far
        int numSorted;

        // the element to be added to sorted section of the array
        int tmpNum;

        //counter for second loop
        int counter;

        //First loop cycles until sorted section of array contains all of the elements
        for (numSorted = 1; numSorted < length; numSorted++)    // Start with 1 (not 0)
        {
            tmpNum = dataArray[numSorted];
            for(counter = numSorted - 1; (counter >= 0) && (dataArray[counter] < tmpNum); counter--)   // Smaller values are moving up
            {
                dataArray[counter+1] = dataArray [counter];
            }
           dataArray[counter +1] = tmpNum;    // Put the key in its proper location
        }
    }
}
