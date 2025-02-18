package com.c0dethink;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "green";
        colors[2] = "blue";
        colors[3] = "yellow";

//        System.out.println(colors);
        System.out.println(Arrays.toString(colors));

//        another way to create an array
        int[] numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

//        iterate an array
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
//      another way to iterate an array (advanced feature)
        for (int number : numbers)
            System.out.println(number);

//        Java Streams to for-loop an array
    }
}
