package com;

public class CoinsDisplay implements IDisplay {
    private int coins;

    private int lives;

    public void update(int coins, int lives) {
//begin of modifiable zone(JavaCode)......C/a1bb4c09-47cd-4e2c-98dd-26cad0830fd3
    coins = coins;
    CoinsDisplay();
//end of modifiable zone(JavaCode)........E/a1bb4c09-47cd-4e2c-98dd-26cad0830fd3
    }

    public void coinsDisplay() {
//begin of modifiable zone(JavaCode)......C/e5cfd4a8-87ab-49b0-bc0a-80da6b44368d
    System.out.println("Number of  coins: " + coins);
//end of modifiable zone(JavaCode)........E/e5cfd4a8-87ab-49b0-bc0a-80da6b44368d
    }

}
