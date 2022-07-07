package com.example.mypackage;

    // import com.company.Horse;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ISaveable charlieHorse;
        charlieHorse = new Horse("Charlie", "TB", 34, "dark bay");
        List <String> values=charlieHorse.write();
        charlieHorse.read(values);

        ISaveable blueHorse;
        blueHorse = new Horse("Blue", "TB", 24, "bright bay");
        List <String> values2=blueHorse.write();
        blueHorse.read(values2);

        ISaveable alfDonkey;
        alfDonkey = new Donkey("Alfred", 12,  "biscuit");
        List <String> donkeyValues=alfDonkey.write();
        alfDonkey.read(donkeyValues);
    }
}
