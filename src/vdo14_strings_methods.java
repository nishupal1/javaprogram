
 package com.company;
import java.util.Scanner;

public class vdo14_strings_methods {
    public static void main() {

        // we can performe all operations at single string but i am perfroming it to be more clear


        String name = "Nishu"; // nishu = 5 charecter
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

        String name1 = "Nishu pal"; // nishu pal = 9 character with including space
        System.out.println(name1);
        int value1 = name1.length();
        System.out.println(value1);

        String name2 = "NISHU";
        System.out.println(name2);
        String lowercase = name2.toLowerCase(); // NISHU = nishu
        System.out.println(lowercase);

        String name3 = "nishu";
        System.out.println(name3);
        String uppercase = name3.toUpperCase();  // nishu = NISHU
        System.out.println(uppercase);

        String nontrimmed = "        Nishu              ";  // include space
        System.out.println(nontrimmed);
        System.out.println(nontrimmed.trim());  // trime space

        String name4 = "Nishu pal";
        System.out.println(name4.substring(3));  // substring print index to end
        System.out.println(name4.substring(2));

        String name5 = "Nishu pal";
        System.out.println(name5.substring(2,7)); // it include index but exclude index
        System.out.println(name5.substring(3,4));

        String name6 = "Nishu pal";
        System.out.println(name6.replace('p', 's'));  // this will repalce only single char
        System.out.println(name6.replace('a', 'i'));
        System.out.println(name6.replace('l', 'r'));

        System.out.println(name6.replace("pal", "sir")); // this will replace word

        String name7 = "Nishu pal";
        System.out.println(name7.startsWith("N")); // tell the starting
        System.out.println(name7.startsWith("i"));
       // System.out.println(name7.startsWith("Nis", "6"));
        System.out.println(name7.endsWith("al")); // tell the ending

        String name8 = "Nishu pal";
        System.out.println(name8.charAt(3)); // tell character at index 3

        System.out.println(name8.indexOf("hu")); // it tell index number of string
        System.out.println(name8.indexOf("u"));  // but the first one








    }
}
