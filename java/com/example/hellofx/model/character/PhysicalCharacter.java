package com.example.hellofx.model.character;

import com.example.hellofx.model.DamageType;

public class PhysicalCharacter extends BasedCharacter{
    public PhysicalCharacter(String name,String imgpath,int basedDef,int basedRes) {
        this.name = name;
        this.type = DamageType.physical;
        this.imgpath = imgpath;
        this.fullHP = 50;
        this.basedPow = 30;
        this.basedDef = basedDef;
        this.basedRes = basedRes;
        this.hp = this.fullHP;
        this.power = this.basedPow;
        this.defense = basedDef;
        this.resistance = basedRes;

    }
}
