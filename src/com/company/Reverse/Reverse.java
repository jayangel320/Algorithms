package com.company.Reverse;

/**
 * Created by jaybob320 on 2/17/16.
 */
public class Reverse {



    public static void Reverse(int array[]){
        int tmp;
        int end = array.length - 1;

        for(int num = 0; num < array.length / 2; num++){
            tmp = array[num];
            array[num] = array[end];
            array[end--] = tmp;
        }
    }
}
