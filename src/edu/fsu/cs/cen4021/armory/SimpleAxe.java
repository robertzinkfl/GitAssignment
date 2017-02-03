package edu.fsu.cs.cen4021.armory;

/**
 * Created by zink on 2/3/17.
 */
public class SimpleAxe {

    SimpleAxe() {
        super(60);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if(armor > 0 && armor < 20) {
            armor = 0;
        }
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
