package com.company;

import com.company.Reverse.Reverse;
import com.company.Sorting.InsertionSort;
import com.company.Sorting.MergeSort;
import com.company.Sorting.QuickSort;
import com.company.Sorting.SelectionSort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {



        //int[] array = {1,3,5,6,0,2,4,6};
        int[] array = {6,4,2,0,6,5,3,1};
        MergeSort.mergeArraysDesc(array,0,3,7);

        for(int counter = 0; counter < Array.getLength(array); counter++) {
            System.out.printf("%d ",array[counter]);
        }

        System.out.println("");

        int[] array2 = {1,4,5,6,7,8,9};
        Reverse.Reverse(array2);
        for(int counter = 0; counter < Array.getLength(array2); counter++) {
            System.out.printf("%d ",array2[counter]);
        }

        System.out.println("");


//TODO: Add heap sort
//TODO: Add Permutation
//TODO: Add reverse order method



    }
}
