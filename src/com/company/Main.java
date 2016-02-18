package com.company;

import com.company.Reverse.Reverse;
import com.company.Sorting.InsertionSort;
import com.company.Sorting.MergeSort;
import com.company.Sorting.QuickSort;
import com.company.Sorting.SelectionSort;
import com.sun.scenario.effect.Merge;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {



//        int[] array = {1,4,5,6,7,8,9};
//
//        MergeSort.sortAsc(array);
//
//
//        for(int counter = 0; counter < Array.getLength(array); counter++) {
//            System.out.printf("%d ",array[counter]);
//        }
//
//        System.out.println("");

        int[] num = {5,2,4,5};

        MergeSort.sortAsc(num);

        System.out.println("");
        System.out.printf("%d ", num[0]);
        System.out.printf("%d", num[1]);




//TODO: Add heap sort
//TODO: Add Permutation
//TODO: Add reverse order method



    }
}
