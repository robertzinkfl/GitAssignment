package edu.fsu.cs.cen4021.armory;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 * Created by zink on 2/6/17.
 */
public class WebRitualArrow extends BasicWeapon implements Weapon {
    WebRitualArrow() throws java.io.IOException {
        super(0 );
        damage = getDamage();
    }

    final int damage;
    Document doc = Jsoup.connect("http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html").get();
    String damageValue = doc.select("h1").first().text();

    private int getDamage() {
        return Integer.parseInt(damageValue);
    }

    @Override
    public int hit() {
        return damage;
    }

    @Override
    public int hit(int armor) {
        if(armor > 10) {
            armor -= 10;
        }
        else armor = 0;
        int damage_adj = damage - armor;
        if (damage_adj < 0) {
            return 0;
        }
        return damage_adj;
    }
}
