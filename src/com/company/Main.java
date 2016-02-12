package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here
            String input = null;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
             input = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] Array = input.split(" ");

        for(String word:Array){
            System.out.println(word);
        }





    }
}
