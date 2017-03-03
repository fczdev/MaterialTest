package com.example.materialtest;

/**
 * Created by 付存哲kk on 2017/2/12.
 */
//水果的实体类
public class Fruit {

    private String name;//水果的名字

    private int imageId;//水果对应图片的资源id


    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
