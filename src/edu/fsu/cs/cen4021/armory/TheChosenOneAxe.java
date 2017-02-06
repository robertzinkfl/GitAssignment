package edu.fsu.cs.cen4021.armory;

import java.io.FileNotFoundException;

/**
 * Created by zink on 2/6/17.
 */
class TheChosenOneAxe extends BasicWeapon implements Weapon {

    TheChosenOneAxe() throws FileNotFoundException { super(0); }

    ChosenAxeFate fate = new ChosenAxeFate();
    int damage = fate.getFate();

    @Override
    public int hit() {
        return damage;
    }

    @Override
    public int hit(int armor) {
        if(armor > 0 && armor < 20) {
            armor = 0;
        }
        damage = damage - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
