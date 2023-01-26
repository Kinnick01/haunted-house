package com.codecool.hauntedhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HauntedHouse {
    protected List<Guest> guestList; //i as iterator in forloop
    protected List<BaseMonster> monsterList;//k as iterator in forloop
    protected BaseMonster monster;
    protected Random random;

    public HauntedHouse(List<Guest> guestList, List<BaseMonster> monsterList, Random random) {
        this.guestList = guestList;
        this.monsterList = monsterList;
        this.random = random;
    }


    public void startHaunting() {
        Random random = new Random();

        int randomMonster = random.nextInt(monsterList.size());
        var randomMonsterType = monsterList.get(randomMonster).monsterType;
        BaseMonster monster = new BaseMonster(randomMonsterType);
        List<Guest> csared = new ArrayList<>();
        for (int i = 0; i < guestList.size(); i++) {
            monster.scare(guestList.get(i));
            csared.add(guestList.get(i));
            System.out.println(csared);
        }
        // each guest should be scared by a random monster selected from the monsterList
        // if it gets too scary for a guest, remove the guest from the list
    }
}
