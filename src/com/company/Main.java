package com.company;

import com.company.Sorting.SelectionSort;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
            String input = null;

       /* BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
             input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] Array = input.split(" ");

        for(String word:Array){
            System.out.println(word);
        }
*/


        int[] array = {1,5,6,3};

        SelectionSort ss = new SelectionSort(array);

        int[] ssArray = ss.sortDesc();
        for(int num: ssArray){
            System.out.printf("%d ",num);
        }

//TODO: Add quick sort
//TODO: Add merge sort
//TODO: Add heap sort
//TODO: Add Permutation
//TODO: Add reverse order method



    }
}
