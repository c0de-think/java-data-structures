package com.c0dethink;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
//        one way to create without specific data type
//        List colors = new ArrayList();

//        create with specific data type
        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        System.out.println(colors);
        System.out.println(colors.contains("red"));
        System.out.println(colors.contains("black"));
//        one way to for loop
        for (String color : colors) {
            System.out.println(color);
        }
//        another way to for loop
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        List<String> colors1 = new ArrayList<>(List.of("red", "green", "blue"));
        System.out.println(colors1);

        colors1.clear();
        System.out.println(colors1);
    }
}
