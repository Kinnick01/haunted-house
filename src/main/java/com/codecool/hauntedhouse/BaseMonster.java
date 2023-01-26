package com.codecool.hauntedhouse;

public class BaseMonster {
    protected MonsterType monsterType;
    protected Demon demon;
    protected Vampire vampire;
    protected Ghost ghost;

    public BaseMonster(MonsterType monsterType) {
        this.monsterType = monsterType;
        this.demon = demon;
        this.vampire = vampire;
        this.ghost = ghost;
    }


    public boolean scare(Guest guest) {
        if (this.monsterType.equals(demon)) {
            guest.healthLevel -= 10;
            guest.scaredLevel += 7;
        } else if (this.monsterType.equals(ghost)) {
            guest.scaredLevel += 33;
        } else if (this.monsterType.equals(vampire)) {
            guest.energyLevel -= 40;
        }
        return guest.scaredLevel > 100 || guest.energyLevel < 25 || guest.healthLevel < 4;
    }

    public MonsterType getMonsterType() {
        return monsterType;
    }
}
