package com.kargah;

import java.util.List;

public class MATERIAL<NAME,TYPE,FACTORY,WEIGHT,PRICE> {

    private NAME name;
    private TYPE type;
    private FACTORY factory;
    private WEIGHT weight;
    private PRICE price;

    public NAME getName() {
        return name;
    }

    public void setName(NAME name) {
        this.name = name;
    }

    public TYPE getType() {
        return type;
    }

    public void setType(TYPE type) {
        this.type = type;
    }

    public FACTORY getFactory() {
        return factory;
    }

    public void setFactory(FACTORY factory) {
        this.factory = factory;
    }

    public WEIGHT getWeight() {
        return weight;
    }

    public void setWeight(WEIGHT weight) {
        this.weight = weight;
    }

    public PRICE getPrice() {
        return price;
    }

    public void setPrice(PRICE price) {
        this.price = price;
    }
   /* public static boolean checkList(String temp, List list) {
        if (list.contains(temp))
            return true;
        else
            return false;
    }
    public void offer (MATERIAL material2,List<Object> list,String temp){
        if (!MATERIAL.checkList(temp,list)){

        }
    }*/
}
