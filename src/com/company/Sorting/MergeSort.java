package com.company.Sorting;

/**
 * Created by jaybob320 on 2/17/16.
 */
public class MergeSort {







    //Method that will merge two sorted arrays together
    public static int[] mergeArraysAsc(int[] array1, int[] array2){

        //Length of merged array
        int mergeLength = array1.length + array2.length;

        //Merged array
        int[] mergeArray = new int[mergeLength];

        //counter for array 1
        int counter1 = 0;

        //counter for array 2
        int counter2 = 0;

        //counter for merged array
        int counter3 = 0;


        while(counter3 < mergeLength){

            if(counter1 == array1.length){
                mergeArray[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }
            else if(counter2 == array2.length){
                mergeArray[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else if(array1[counter1] < array2[counter2]){
                mergeArray[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else{
                mergeArray[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }

        }

        return mergeArray;
    }

    //Method that will merge two sorted arrays together
    public static int[] mergeArraysDesc(int[] array1, int[] array2){

        //Length of merged array
        int mergeLength = array1.length + array2.length;

        //Merged array
        int[] mergeArray = new int[mergeLength];

        //counter for array 1
        int counter1 = 0;

        //counter for array 2
        int counter2 = 0;

        //counter for merged array
        int counter3 = 0;


        while(counter3 < mergeLength){

            if(counter1 == array1.length){
                mergeArray[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }
            else if(counter2 == array2.length){
                mergeArray[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else if(array1[counter1] > array2[counter2]){
                mergeArray[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else{
                mergeArray[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }

        }

        return mergeArray;
    }
}
