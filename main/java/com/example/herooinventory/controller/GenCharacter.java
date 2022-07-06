package com.example.herooinventory.controller;

import com.example.herooinventory.model.character.BasedCharacter;
import com.example.herooinventory.model.character.BattleMageCharacter;
import com.example.herooinventory.model.character.MagicalCharacter;
import com.example.herooinventory.model.character.PhysicalCharacter;

import java.util.Random;

public class GenCharacter {
    public static BasedCharacter setUpCharacter() {
        BasedCharacter character;
        Random rand = new Random();
        int type = rand.nextInt(4);
        int basedDef = rand.nextInt(50)+1;
        int basedRes = rand.nextInt(50)+1;
        if (type == 1) {
            character = new MagicalCharacter("MagicChar1","assets/wizard.png",basedDef,basedRes);
        }
        else if (type == 2) {
            character = new PhysicalCharacter("PhysicalChar1","assets/knight.png",basedRes,basedDef);
        }
        else {
            character = new BattleMageCharacter("BattleMage1","assets/battlemage.png",basedRes,basedDef);
        }
        return character;
    }
}
