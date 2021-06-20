package com.example.mainapp.model;

import java.io.Serializable;

public class Jewellery implements Serializable {
    private String id, name, cost, description;
    private int coverAdder;
    private int[] imagesAdder;
    private int clickNum;

    public Jewellery(String id, String name, String cost, String description, int coverAdder,
                     int[] imagesAdder) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.coverAdder = coverAdder;
        this.imagesAdder = imagesAdder;
        this.clickNum = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public int getCoverAdder() {
        return coverAdder;
    }

    public int[] getImagesAdder() {
        return imagesAdder;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void incrementClickNum() {
        this.clickNum++;
    }
}
