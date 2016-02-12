package com.company.Sorting;

import java.lang.reflect.Array;

/**
 * Created by jaybob320 on 2/11/16.
 */
/*------------------------------------------------------------------/
 * The selection sort is a sorting algorithm that works by splitting
 * the array into two arrays one that is sorted and one that is
 * unsorted. Initially the sorted array has zero elements and the
 * unsorted array is the original array. First the smallest/largest
 * element is found then taken from the sorted array and made the
 * first element in the sorted array. Then the next smallest/largest
 * element is found and placed into the second element of the sorted
 * array. This is repeated until the sorted array contains all the values
 * of the original array.
 * The concept of a sorted array and unsorted array is only used for
 * explanation as you are really only using one array.
 /-----------------------------------------------------------------*/
public class SelectionSort {



    private int[] dataArray;
    private int length;

    public SelectionSort(int[] dataArray) {
        this.dataArray = dataArray;
        this.length = Array.getLength(dataArray);
    }


    //Takes the users input array and sorts it from smallest to largest
    public int[] sortAsc(){
        int tmpInt;
        int minIntIndex = 0;

        //On every loop the smallest element of the remaining unsorted elements
        //is added to the sorted section of the array
        for(int counter1 = 0; counter1 < length - 1; counter1++)
        {
            //Second loop cycles through the unsorted section of the array
            // to find the smallest elements index
            for (int counter2 = counter1 + 1; counter2 < length; counter2++) {

                //This starts the smallest element' s index as the first element's index in
                //the unsorted section of the array
                minIntIndex = counter1;

                //Checks if the next sequential element is less then the current minIntIndex
                if (dataArray[counter2] < dataArray[minIntIndex]) {

                    //If this is true the next sequential element's index is now set as the
                    //smallest element's index
                    minIntIndex = counter2;
                }
            }

                //Adds the smallest element to the sorted section of the array
                if(minIntIndex != counter1){
                    tmpInt = dataArray[counter1];
                    dataArray[counter1] = dataArray[minIntIndex];
                    dataArray[minIntIndex] = tmpInt;

            }
        }
        //The now sorted array is returned
        return dataArray;
    }

    //Takes the users input array and sorts it from largest to smallest
    public int[] sortDesc(){
        int tmpInt;
        int maxIntIndex = 0;

        //On every loop the largest element of the remaining unsorted elements
        //is added to the sorted section of the array
        for(int counter1 = 0; counter1 < length - 1; counter1++)
        {
            //Second loop cycles through the unsorted section of the array
            // to find the largest elements index
            for (int counter2 = counter1 + 1; counter2 < length; counter2++) {

                //This starts the largest element's index as the first element's index in
                //the unsorted section of the array
                maxIntIndex = counter1;

                //Checks if the next sequential element is less then the current minIntIndex
                if (dataArray[counter2] > dataArray[maxIntIndex]) {

                    //If this is true the next sequential element's index is now set as the
                    //largest element's index
                    maxIntIndex = counter2;
                }
            }

            //Adds the largest element to the sorted section of the array
            if(maxIntIndex != counter1){
                tmpInt = dataArray[counter1];
                dataArray[counter1] = dataArray[maxIntIndex];
                dataArray[maxIntIndex] = tmpInt;

            }
        }
        //The now sorted array is returned
        return dataArray;
    }

}
