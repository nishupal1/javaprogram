package com.company;
import java.util.Scanner;


public class vdo13_strings {
    public static void main(String[] args) {
        String name = new String("Nishu pal");
        System.out.println(name);
        String name1 = "Nishu Pal";
        System.out.println(name1);
        int a = 12;
        float b = 2.23f;
        System.out.printf("The value of a is %d and value of b is %f%n", a, b);
        System.out.format("The value of a is %d and the value of b is %100.2f\n", a, b);
        //%d for int, %f for float, 100 means 100 space, .2 means two decimal,
        // \n means break line, fromat and print is same, sc.next for one word, nextline for whool line

        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.print(st);
        String st1 = sc.nextLine();
        System.out.println(st1);






    }

}
