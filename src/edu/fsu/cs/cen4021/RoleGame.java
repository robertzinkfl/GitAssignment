package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

import java.io.FileNotFoundException;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) throws FileNotFoundException, java.io.IOException, java.lang.ClassNotFoundException {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.\n");

        //TODO: Add the remaining weapons here

        Weapon axe = WeaponFactory.getWeapon("simpleaxe");
        System.out.println("Simple Axe has " + axe.hit() + " of damage.");
        System.out.println("Simple Axe was able to do " + axe.hit(armor) + " of damage to an armor with " + armor + " points.\n");

        Weapon arrow = WeaponFactory.getWeapon("simplearrow");
        System.out.println("Simple Arrow has " + arrow.hit() + " of damage.");
        System.out.println("Simple Arrow was able to do " + arrow.hit(armor) + " of damage to an armor with " + armor + " points.\n");

        Weapon staff = WeaponFactory.getWeapon("simplemagicstaff");
        System.out.println("Simple Magic Staff has " + staff.hit() + " of damage.");
        System.out.println("Simple Magic Staff was able to do " + staff.hit(armor) + " of damage to an armor with " + armor + " points.\n");

        Weapon specialaxe = WeaponFactory.getWeapon("chosenoneaxe");
        System.out.println("The Chosen One Axe has " + specialaxe.hit() + " of damage.");
        System.out.println("The Chosen One Axe was able to do " + specialaxe.hit(armor) + " of damage to an armor with " + armor + " points.\n");

        Weapon specialstaff = WeaponFactory.getWeapon("ancientmagicstaff");
        System.out.println("The Ancient Magic Staff has " + specialstaff.hit() + " of damage.");
        System.out.println("The Ancient Magic Staff was able to do " + specialstaff.hit(armor) + " of damage to an armor with " + armor + " points.\n");

    }
}
