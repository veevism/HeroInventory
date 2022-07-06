package com.example.herooinventory.model.character;

import com.example.herooinventory.model.DamageType;

public class MagicalCharacter extends BasedCharacter{
    public MagicalCharacter(String name, String imgpath, int basedDef, int basedRes) {
        this.name = name;
        this.type = DamageType.magical;
        this.imgpath = imgpath;
        this.fullHP = 30;
        this.basedPow = 50;
        this.basedDef = basedDef;
        this.basedRes = basedRes;
        this.hp = this.fullHP;
        this.power = this.basedPow;
        this.defense = basedDef;
        this.resistance = basedRes;
    }
}
