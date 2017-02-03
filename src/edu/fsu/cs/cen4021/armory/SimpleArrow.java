package edu.fsu.cs.cen4021.armory;

/**
 * Created by zink on 2/3/17.
 */
class SimpleArrow extends BasicWeapon implements Weapon {

    SimpleArrow() {
        super(70 );
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if(armor > 5) {
            armor -= 5;
        }
        else armor = 0;
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
