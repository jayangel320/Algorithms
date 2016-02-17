package com.company.Sorting;

/**
 * Created by jaybob320 on 2/16/16.
 */




/*---------------------------------------------------------------------------------/
 * The quick sort method starts with you choosing a pivot element in an array. The
 * pivot is usually chosen to be one of the elements in the center of the array.
 * Then the elements to the left and right of the pivot are examined. For the sake of
 * explanation this will be quick sort to ascending order. The elements to the left
 * are cycled through from left to right and compared to the pivot. As soon as one
 * that is greater than the pivot its index is saved. The same is done for elements
 * to the right except that they are checked to be less than the pivot. Once a right
 * and left element are found they are switched. This is repeated until the all elements
 * to the left of the pivot are less than the pivot and all greater to the right. One
 * thing to notice is that the pivot itself can be moved around because in the end
 * the pivot would have to be in its final location in the array. After this is done
 * the array is split into two, unless the pivot was the smallest or largest element
 * then only one, arrays and the method is called recursively on these smaller sections
 * until the entire array is sorted.
 /--------------------------------------------------------------------------------*/
public class QuickSort {



    public static void sortAsc(int[] dataArray, int left, int right ){

        //Checks that array is not empty
        if (dataArray == null || dataArray.length == 0)
            return;

        if (left >= right)
            return;


        // pick the pivot gets the mostly middle element index
        int middle = left + (right - left) / 2;

        //assigns the pivot as the middle element
        int pivot = dataArray[middle];

        // make left < pivot and right > pivot
        int i = left, j = right;

        //while loop runs until all of the numbers to the left of the pivot are less than it and the greater than it
        //to the right
        while (i <= j) {

            //This finds how many elements coming from the left the pivot is greater than
            while (dataArray[i] < pivot) {
                i++;
            }

            //this finds how many elements coming to the right the pivot is less than
            while (dataArray[j] > pivot) {
                j--;
            }

            //only is skipped when i > j
            if (i <= j) {


                int temp = dataArray[i];
                dataArray[i] = dataArray[j];
                dataArray[j] = temp;
                i++;
                j--;
            }
        }



        //this section recursively sorts the sections to the left and right of the pivot
        if (left < j)
            sortAsc(dataArray, left, j);

        if (right > i)
            sortAsc(dataArray, i, right);
    }


    public static void sortDesc(int[] dataArray, int left, int right ){

        //Checks that array is not empty
        if (dataArray == null || dataArray.length == 0)
            return;

        //Checks the size of the section being sorted; if its one its already sorted
        if (left >= right)
            return;

        // pick the pivot; gets the mostly middle element index
        int middle = left + (right - left) / 2;

        //assigns the pivot as the middle element
        int pivot = dataArray[middle];

        // make left < pivot and right > pivot
        int i = left, j = right;

        //while loop runs until all of the numbers to the left of the pivot are less than it and all to the
        // right are greater than it
        while (i <= j) {

            //This finds how many elements coming from the left the pivot is less than
            while (dataArray[i] > pivot) {
                i++;
            }

            //this finds how many elements coming to the right the pivot is greater than
            while (dataArray[j] < pivot) {
                j--;
            }

            //only is skipped when i > j
            if (i <= j) {

                int temp = dataArray[i];
                dataArray[i] = dataArray[j];
                dataArray[j] = temp;
                i++;
                j--;
            }
        }



        //this section recursively sorts the sections to the left and right of the pivot
        if (left < j)
            sortDesc(dataArray, left, j);

        if (right > i)
            sortDesc(dataArray, i, right);
    }
}
