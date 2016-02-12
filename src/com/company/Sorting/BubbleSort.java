package com.company.Sorting;

import java.lang.reflect.Array;

/**
 * Created by jaybob320 on 2/11/16.
 */

/*--------------------------------------------------------------/
 * The bubble sort is a sorting algorithm that works by
 * cycling through each element in array and allowing it
 * to bubble up through the array when it has a larger/smaller
 * value then the next consecutive element in order to produce
 * an array that is now sorted in ascending/descending order
 /-------------------------------------------------------------*/
public class BubbleSort {

    private int[] dataArray;
    private int length;

    public BubbleSort(int[] dataArray) {
        this.dataArray = dataArray;
        this.length = Array.getLength(dataArray);
    }


    //Takes the users input array and sorts it from smallest to largest
    public int[] sortAsc(){
        int tmpInt;

        //First loop determines which element will be allowed to bubble up
        for(int counter1 = 0; counter1 < length - 1; counter1++ ) {

            //Second loop will bubble up a specific element
            for (int counter2 = counter1; counter2 < length - 1; counter2++) {

                //Checks if the element is greater than the next element
                if (dataArray[counter2] > dataArray[counter2 + 1]) {

                    //If the element is greater it switches location in the array with the next consecutive element
                    tmpInt = dataArray[counter2];
                    dataArray[counter2] = dataArray[counter2 + 1];
                    dataArray[counter2 + 1] = tmpInt;
                }
            }
        }
        //The now sorted array is returned
        return dataArray;
    }

    //Takes the users input array and sorts it from largest to smallest
    public int[] sortDesc(){
        int tmpInt;

        //First loop determines which element will be allowed to bubble up
        for(int counter1 = 0; counter1 < length - 1; counter1++ ) {

            //Second loop will bubble up a specific element
            for (int counter2 = counter1; counter2 < length - 1; counter2++) {

                //Checks if the element is greater than the next element
                if (dataArray[counter2] < dataArray[counter2 + 1]) {

                    //If the element is greater it switches location in the array with the next consecutive element
                    tmpInt = dataArray[counter2];
                    dataArray[counter2] = dataArray[counter2 + 1];
                    dataArray[counter2 + 1] = tmpInt;
                }
            }
        }
        //The now sorted array is returned
        return dataArray;
    }





}
