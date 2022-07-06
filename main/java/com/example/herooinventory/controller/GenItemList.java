package com.example.herooinventory.controller;

import com.example.herooinventory.model.DamageType;
import com.example.herooinventory.model.item.Armor;
import com.example.herooinventory.model.item.BasedEquipment;
import com.example.herooinventory.model.item.Weapon;

import java.util.ArrayList;

public class GenItemList {
        public static ArrayList<BasedEquipment> setUpItemList() {
            ArrayList<BasedEquipment> itemLists = new ArrayList<BasedEquipment>(5);
            itemLists.add(new Weapon("Sword", 10, DamageType.physical, "assets/sword1.png"));
            itemLists.add(new Weapon("Gun", 20, DamageType.physical, "assets/gun1.png"));
            itemLists.add(new Weapon("Staff", 30, DamageType.magical, "assets/staff1.png"));
            itemLists.add(new Armor("shirt", 0, 50, "assets/shirt1.png"));
            itemLists.add(new Armor("armor", 50, 0, "assets/armor1.png"));
            itemLists.add(new Weapon("Bazooka", 60, DamageType.battlemage, "assets/bazooka.png"));
            return itemLists;
        }
    }

