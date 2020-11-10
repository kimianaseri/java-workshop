package com.kargah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MATERIAL material1 = new MATERIAL();
        MATERIAL material2 = new MATERIAL();
        MATERIAL material3 = new MATERIAL();
        MATERIAL material4 = new MATERIAL();
        MATERIAL material5 = new MATERIAL();

        List<Object> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();


        material1.setName("Ice-Cream");
        material1.setType("Edible");
        material1.setFactory("Mihan");
        material1.setWeight("50 g");
        material1.setPrice("2500 T");
        material2.setName("Clothes");
        material2.setType("Silk");
        material2.setFactory("Gucci");
        material2.setWeight("250 g");
        material2.setPrice("1500000 T");
        material3.setName("Meat");
        material3.setType("Edible");
        material3.setFactory("pouya");
        material3.setWeight("0.5 kg");
        material3.setPrice("500000 T");
        material4.setName("Blender");
        material4.setType("Home appliances");
        material4.setFactory("Bosch");
        material4.setWeight("1 kg");
        material4.setPrice("3000000 T");
        material5.setName("Flower");
        material5.setType("Rose");
        material5.setFactory("garden");
        material5.setWeight("100 g");
        material5.setPrice("60000 T");

        while (true){
            Scanner scanner  = new Scanner(System.in);
            System.out.println("\n menu");
            System.out.println("1 - show materials");
            System.out.println("2 - price with off");
            System.out.println("3 - price with taxes");
           
            switch (scanner.nextInt()) {
                case 1 :
                System.out.println("LIST :");
                System.out.println("material 1 : " + material1.getName() + "\t" + material1.getType() + "\t" + material1.getFactory() + "\t" + material1.getWeight() + "\t" + material1.getPrice() + "\t");
                System.out.println("material 2 : " + material2.getName() + "\t" + material2.getType() + "\t" + material2.getFactory() + "\t" + material2.getWeight() + "\t" + material2.getPrice() + "\t");
                System.out.println("material 3 : " + material3.getName() + "\t" + material3.getType() + "\t" + material3.getFactory() + "\t" + material3.getWeight() + "\t" + material3.getPrice() + "\t");
                System.out.println("material 4 : " + material4.getName() + "\t" + material4.getType() + "\t" + material4.getFactory() + "\t" + material4.getWeight() + "\t" + material4.getPrice() + "\t");
                System.out.println("material 5 : " + material5.getName() + "\t" + material5.getType() + "\t" + material5.getFactory() + "\t" + material5.getWeight() + "\t" + material5.getPrice() + "\t");
                break;
                case 2 :
                    System.out.println("choose your material to see your offer: ");
                    list1.add((String) material1.getName());
                    list1.add((String) material2.getName());
                    list1.add((String) material3.getName());
                    list1.add((String) material4.getName());
                    list1.add((String) material5.getName());
                    String temp = scanner.nextLine();
                    for (String s : list1){
                        System.out.println(s);
                    }
                    switch (scanner.nextInt()){
                        case 1 :
                            material1.setPrice("2000 T with 20% off");
                            System.out.println("the price is :" + material1.getPrice());
                            break;
                        case 2 :
                            material2.setPrice("1125000 t with 25% off");
                            System.out.println("the price is :" + material2.getPrice());
                            break;
                        case 3 :
                            material3.setPrice("450000 t with 10% off");
                            System.out.println("the price is :" + material3.getPrice());
                            break;
                        case 4 :
                            material4.setPrice("1500000 t with 50% off");
                            System.out.println("the price is :" + material4.getPrice());
                            break;
                        case 5 :
                            material5.setPrice("60000 t with 0% off");
                            System.out.println("the price is :" + material5.getPrice());
                            break;
                    }
                    break;
                case 3 :
                            System.out.println("choose your material to see your tax deducted: ");
                            list2.add((String) material1.getName());
                            list2.add((String) material2.getName());
                            list2.add((String) material3.getName());
                            list2.add((String) material4.getName());
                            list2.add((String) material5.getName());
                            String temp1 = scanner.nextLine();
                            for (String j : list2){
                                System.out.println(j);
                            }
                            switch (scanner.nextInt()){
                                case 1 :
                                    material1.setPrice("2250 with 10% tax");
                                    System.out.println("the price is :" + material1.getPrice());
                                    break;
                                case 2 :
                                    material2.setPrice("1425000 t with 5% tax");
                                    System.out.println("the price is :" + material2.getPrice());
                                    break;
                                case 3 :
                                    material3.setPrice("450000 t with 10% tax");
                                    System.out.println("the price is :" + material3.getPrice());
                                    break;
                                case 4 :
                                    material4.setPrice("2910000 t with 3% tax");
                                    System.out.println("the price is :" + material4.getPrice());
                                    break;
                                case 5 :
                                    material5.setPrice("60000 t with 0% tax");
                                    System.out.println("the price is :" + material5.getPrice());
                                    break;
                            }
                            break;

            }
        }
    }
}
