package edu.fsu.cs.cen4021.armory;

import java.io.*;
import java.util.Scanner;

/**
 * Created by zink on 2/6/17.
 */
public class ChosenAxeFate {

    public int getFate() throws FileNotFoundException {
        int damage = 1;
        Scanner chosenone = new Scanner(new File("conf/thechosenone.txt"));

        final String a = chosenone.nextLine();

        do { damage++; } while (chosenone.nextLine().equals(a));

        return damage;
    }

}
