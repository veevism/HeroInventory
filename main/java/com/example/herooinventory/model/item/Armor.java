package com.example.herooinventory.model.item;

public class Armor extends BasedEquipment{
    private int defense, resistance;
    public Armor(String name,int defense,int resistance,String imgpath) {
        this.name = name;
        this.imgpath = imgpath;
        this.defense = defense;
        this.resistance = resistance;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    @Override
    public String toString() {
        return name;
    }
}
