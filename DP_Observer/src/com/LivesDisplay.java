package com;

public class LivesDisplay implements IDisplay {
    private int lives;

    private int coins;

    public void update(int coins, int lives) {
//begin of modifiable zone(JavaCode)......C/ec9eabd0-4132-4846-99b6-33290257d787
    lives = lives;
    livesDisplay();
//end of modifiable zone(JavaCode)........E/ec9eabd0-4132-4846-99b6-33290257d787
    }

    public void livesDisplay() {
//begin of modifiable zone(JavaCode)......C/a1d2d6b6-8f17-4045-af3c-369f3f761a37
    System.out.println ("Number of lives: " + lives);
//end of modifiable zone(JavaCode)........E/a1d2d6b6-8f17-4045-af3c-369f3f761a37
    }

}
