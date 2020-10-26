package com.kargah;

import javax.xml.namespace.QName;
import java.util.Scanner;

public class Main {
    public static Information str = new Information();
    public static void main(String[] args) throws InfoException {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter the name ");
        String tem = input.nextLine();
        str.setName(tem);
        System.out.println("enter the id ");
        tem = input.nextLine();
        str.setId(tem);
        System.out.println("enter the education ");
        tem = input.nextLine();
        str.setEducation(tem);
        System.out.println("enter the job ");
        tem = input.nextLine();
        str.setJob(tem);
        System.out.println("enter the salary ");
        tem = input.nextLine();
        str.setSalary(tem);
        str.getinfo();

        System.out.println("enter id number to search:");
        String tm = input.nextLine();
        if (tm.equals(str.id)){
            System.out.println(str.name +"\n" + str.id+"\n" + str.education+"\n" + str.job+"\n" + str.salary);
        }else throw new InfoException("your id is wrong");

    }
}
