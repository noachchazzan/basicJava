package com.seleniumguru;

public class StringMethods {
    public static void main (String args[]) {
        String str1 = "Hello Students" + "Welcome to Java World!";
        String str2 = "Welcome";
        String str3 = "";
        String str4 = " ";
        System.out.println(str1.length());
        System.out.println(str1.substring(1));
        System.out.println(str1.substring(6, 13));
        System.out.println(str1.contains("Hello"));
        System.out.println(str2.equals("welcome"));
        System.out.println(str2.equalsIgnoreCase("welcome"));
        System.out.println(str3.isEmpty());
        System.out.println(str3.isEmpty());



    }
}
