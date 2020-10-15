package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Compare string1=new Compare();
        System.out.println("enter the first string");
        string1.str1=new Scanner(System.in).next();
        Compare string2=new Compare();
        System.out.println("enter the second string");
        string2.str1=new Scanner(System.in).next();
        Compare n1=new Compare();
        Compare n2=new Compare();
        string1.a();
        string2.b();
        if(n1.x1> n2.x2)
            System.out.println("first string is longer");
        else if(n1.x1< n2.x2)
            System.out.println("second string is longer");
        else
            System.out.println("they are equal");

    }
}
