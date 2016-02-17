package com.company;

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



        int[] array1 = {6,5,3,1};
        int[] array2 = {6,4,2,0};
        int[] mergeArray = MergeSort.mergeArraysDesc(array1,array2);

        for(int counter = 0; counter < Array.getLength(mergeArray); counter++) {
            System.out.printf("%d ",mergeArray[counter]);
        }

        System.out.println("");


//TODO: Add heap sort
//TODO: Add Permutation
//TODO: Add reverse order method



    }
}
