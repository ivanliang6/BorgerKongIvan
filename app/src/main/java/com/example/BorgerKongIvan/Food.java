package com.example.BorgerKongIvan;

import java.io.Serializable;

public class Food implements Serializable{
    private int id;
    private String name;
    private int img;
    private String note;
    private double price;
    private int num;

    public Food(int id, String name, int img, String note, double price) {
        this.id = id;
        this.name = name;
        this.img = img;
        this.note = note;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getId() {

        return id;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getImg() {

        return img;
    }


    public String getNote() {
        return note;
    }

    public double getPrice(){
        return price;
    }



}
