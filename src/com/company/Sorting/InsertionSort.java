package com.company.Sorting;

import java.lang.reflect.Array;

/**
 * Created by jaybob320 on 2/11/16.
 */

/*-------------------------------------------------------------------------------------/
 * The insertion sort works by imagining two parts to an array. One part is sorted and
 * the other part is unsorted. In the beginning the sorted array is one element, the
 * zeroth element, and the unsorted section consists of the rest of the values. Then by
 * choosing one element at a time we add to the sorted section. Once this element is
 * chosen it is compared to every element in the sorted section and inserted into its
 * appropriate position. This makes the sorted section grow by one and unsorted shrink
 * by one element.
 /------------------------------------------------------------------------------------*/
public class InsertionSort {


    private int[] dataArray;
    private int length;

    public InsertionSort(int[] dataArray) {
        this.dataArray = dataArray;
        this.length = Array.getLength(dataArray);
    }

//TODO: Add a sortAsc
    public int[] sortAsc(){
        //The number of elements that have been sorted so far
        int numSorted;

        //The element to be added to sorted section of the array
        int tmpNum;

        //counter for second loop
        int counter;

        //First loop cycles until sorted section of array contains all of the elements
        // you start with 1, not 0, since we begin with a sorted array of one element which is
        //of course already sorted
        for(numSorted = 1; numSorted < length;numSorted++){

            //element to be sorted assigned
            tmpNum = dataArray[numSorted];

            //second loop cycles though sorted section pulling the numbers to the right until the location for the
            //new addition is found
            for(counter = numSorted - 1;(counter >= 0) && (dataArray[counter] > tmpNum); counter --){

                //pulls the numbers in the sorted section to the right
                dataArray[counter + 1] = dataArray[counter];

            }

            // Put the tmpNum in its proper location in the sorted section
            dataArray[counter + 1] = tmpNum;


            for(int i = 0; i < length; i++)
            {
                System.out.printf("%d ", dataArray[i]);
            }
            System.out.println(" ");
        }
        return dataArray;

    }

//TODO: Add a lot of description to this
    public int[] sortDesc( )
    {
        //The number of elements that have been sorted so far
        int numSorted;

        //The element to be added to sorted section of the array
        int tmpNum;

        //counter for second loop
        int counter;

        //First loop cycles until sorted section of array contains all of the elements
        // you start with 1, not 0, since we begin with a sorted array of one element which is
        //of course already sorted
        for (numSorted = 1; numSorted < length; numSorted++)
        {
            //we assign the element to be added to the sorted section of the array
            tmpNum = dataArray[numSorted];

            // loops through the sort section until the counter goes to zero or the counter element is less then
            // the element to be inserted (tmpNum)
            for(counter = numSorted - 1; (counter >= 0) && (dataArray[counter] < tmpNum); counter--)
            {
                //moves the sorted elements to the right making room for the element started from the right most
                // element of the sorted section
                dataArray[counter + 1] = dataArray [counter];
            }

            // Put the tmpNum in its proper location in the sorted section
           dataArray[counter + 1] = tmpNum;

        }
        return dataArray;
    }
}
