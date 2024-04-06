package com.count.marketapp;

public class Item{
    String name;
    String description;
    int imgResource;
    Item(String name, String description, int imgResource){
        this.name = name;
        this.description = description;
        this.imgResource = imgResource;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int getImgResource(){
        return imgResource;
    }
}
