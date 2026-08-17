package com.company;
import java.util.Scanner;

public class vdo15_string_practice {
    public static void main() {

        // Question 1
        String name = "This is Nishu Pal";
        name = name.toLowerCase();
        System.out.println(name);

        // Question 2
        String name1 = "This is Nishu Pal";
        name1 = name1.replace(" ", "_");
        System.out.println(name1);

        // Question 3
        String letter = " Dear <|name|>, Trans a lot";
        letter = letter.replace("<|name|>", "Nishu");
        System.out.println(letter);
    }
}
