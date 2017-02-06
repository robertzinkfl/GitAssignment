package edu.fsu.cs.cen4021.armory;

/**
 * Created by zink on 2/3/17.
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon {

    SimpleMagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (armor *= .8);
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
