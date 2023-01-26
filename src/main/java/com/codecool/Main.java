package com.codecool;

import com.codecool.hauntedhouse.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MonsterType demon = new Demon();
        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Mary"));

        List<BaseMonster> monsters = new ArrayList<>();
        BaseMonster monster = new BaseMonster(demon);
        monsters.add(monster);

        HauntedHouse hauntedHouse = new HauntedHouse(guests, monsters, new Random());

        hauntedHouse.startHaunting();

    }
}
