package com.example.herooinventory.model.item;

import com.example.herooinventory.model.DamageType;

public class Weapon extends BasedEquipment{
    private int power;
    private DamageType damageType;
    public Weapon(String name, int power, DamageType damageType,String imgpath) {
        this.name = name;
        this.imgpath = imgpath;
        this.power = power;
        this.damageType = damageType;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public int getPower() {
        return power;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    @Override
    public String toString() {
        return name;
    }
}
