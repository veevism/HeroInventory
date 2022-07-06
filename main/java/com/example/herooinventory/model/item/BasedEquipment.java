package com.example.herooinventory.model.item;

import javafx.scene.input.DataFormat;

import java.io.Serializable;

public class BasedEquipment implements Serializable {
    public static final DataFormat DATA_FORMAT = new DataFormat("com.example.herooinventory.model.character.BasedCharacter"); //care for path
    protected String name;
    protected String imgpath;

    public String getName() {
        return name;
    }

    public String getImagepath() {
        return imgpath;
    }

    public void setImagepath(String imgpath) {
        this.imgpath = imgpath;
    }
}
