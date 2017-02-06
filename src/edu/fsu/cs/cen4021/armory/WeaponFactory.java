/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen4021.armory;

import java.io.FileNotFoundException;

/**
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) throws FileNotFoundException, ClassNotFoundException, java.io.IOException {
        switch (type) {
            case "sword":
                return new Sword();
            case "simpleaxe":
                return new SimpleAxe();
            case "simplemagicstaff":
                return new SimpleMagicStaff();
            case "simplearrow":
                return new SimpleArrow();
            case "chosenoneaxe":
                return new TheChosenOneAxe();
            case "ancientmagicstaff":
                return new AncientMagicStaff();
            case "webritualarrow":
                return new WebRitualArrow();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
