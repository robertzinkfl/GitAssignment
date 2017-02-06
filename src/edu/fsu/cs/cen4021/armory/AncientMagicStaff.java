package edu.fsu.cs.cen4021.armory;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zink on 2/6/17.
 */
public class AncientMagicStaff extends BasicWeapon implements Weapon {
    AncientMagicStaff() throws IOException, ClassNotFoundException {
        super(80);
        damage = getDamage();
    }

    FileInputStream inputStream = new FileInputStream("conf/ancientstaff.obj");
    ObjectInputStream objectInput = new ObjectInputStream(inputStream);
    ArrayList<Integer> values = (ArrayList<Integer>) objectInput.readObject();
    final int damage;

    private int getDamage() {
        int damagevalue;
        for(Integer i : values) i = i * i;
        values.remove(4);
        values.remove(1);
        Collections.reverse(values);

        damagevalue = values.get(0) + values.get(2) + values.get(6);

        return damagevalue;
    }

    @Override
    public int hit() {
        return damage;
    }

    @Override
    public int hit(int armor) {
        int damage_adj = damage - (armor *= .75);
        if (damage_adj < 0) {
            return 0;
        }
        return damage_adj;
    }
}
