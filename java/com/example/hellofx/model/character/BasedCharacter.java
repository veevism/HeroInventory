package com.example.hellofx.model.character;

import com.example.hellofx.model.DamageType;
import com.example.hellofx.model.item.Armor;
import com.example.hellofx.model.item.Weapon;

public class BasedCharacter {
    protected String name, imgpath;
    protected DamageType type;
    protected Integer fullHP, basedPow, basedDef, basedRes;
    protected Integer hp, power, defense, resistance;
    protected Weapon weapon;
    protected Armor armor;

    public String getName() {
        return name;
    }

    public String getImgpath() {
        return imgpath;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getFullHP() {
        return fullHP;
    }

    public Integer getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "BasedCharacter{" +
                "name='" + name + '\'' +
                '}';
    }

    public Integer getDefense() {
        return defense;
    }

    public Integer getResistance() {
        return resistance;
    }
    public DamageType getType() {
        return type;
    }

}
