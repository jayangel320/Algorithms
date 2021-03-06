package com.company.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by jaybob320 on 2/17/16.
 */
public class MergeSort {


    public static void sortAsc(int[] array){
        mergeSortAsc(array, 0, array.length -1);
    }



    public static void mergeSortAsc(int[] array, int start, int end){
        if(start == end){
            return;
        }

        int middle = (end - start) / 2;

        System.out.printf("%d %d %d %n",start,middle,end);



        mergeSortAsc(array, start, middle);


        mergeSortAsc(array, middle + 1, end);

        System.exit(0);

        mergeArraysAsc(array,start,middle,end);

    }






    //Method that will merge two sorted arrays together
    public static void mergeArraysAsc(int[] array, int start, int middle, int end){

        //copy first section to new array
        int[] array1 = Arrays.copyOfRange(array, start,middle+1);


        //copy second section to new array
        int[] array2 = Arrays.copyOfRange(array,middle+1,end+1);


        //counter for array 1
        int counter1 = 0;

        //counter for array 2
        int counter2 = 0;

        //counter for merged array
        int counter3 = start;

        while(counter3 < end){

            if(array1.length == 1 && array2.length == 1){
                if(array1[counter1] < array2[counter2]){
                    array[counter3++] = array1[counter1];
                    array[counter3++] = array2[counter2];
                }
                else{
                    array[counter3++] = array2[counter2];
                    array[counter3++] = array1[counter1];
                }
            }
            else if(counter1 == array1.length){
                array[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }
            else if(counter2 == array2.length){
                array[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else if(array1[counter1] < array2[counter2]){
                array[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else{
                array[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }

        }
    }

    //Method that will merge two sorted arrays together
    public static void mergeArraysDesc(int[] array, int start, int middle, int end){


        //copy first section to new array
        int[] array1 = Arrays.copyOfRange(array, start,middle+1);

        //copy second section to new array
        int[] array2 = Arrays.copyOfRange(array,middle+1,end+1);

        //counter for array 1
        int counter1 = 0;

        //counter for array 2
        int counter2 = 0;

        //counter for merged array
        int counter3 = start;

        while(counter3 < end){

            if(counter1 == array1.length){
                array[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }
            else if(counter2 == array2.length){
                array[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else if(array1[counter1] > array2[counter2]){
                array[counter3++] = array1[counter1];
                if(counter1 < array1.length){
                    counter1++;
                }
            }
            else{
                array[counter3++] = array2[counter2];
                if(counter2 < array2.length){
                    counter2++;
                }
            }

        }
    }
}
