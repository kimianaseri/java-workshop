package kargah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Calory c=new Calory();
        System.out.println("1.shena / 2.barfiks / 3.derazneshast / 4.tanabzani / 5.scott");
        System.out.println("Enter a number to choose your sport");
        n=new Scanner(System.in).nextInt();
        System.out.println("tedade harekat ra vared konid");
        c.x=new Scanner(System.in).nextInt();
        switch(n){
            case 1:
                c.shena();
                break;
            case 2:
                c.barfkis();
                break;
            case 3:
                c.derazneshst();
                break;
            case 4:
                c.tanabzani();
                break;
            case 5:
                c.scot();
                break;
        }
    }
}
