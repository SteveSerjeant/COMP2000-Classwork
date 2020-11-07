package com;

import java.util.ArrayList;

public class GamePlayer implements ISubject{
    private ArrayList Displays;

    private int lives;

    private int coins;

    private String name;

    public GamePlayer(){

        Displays = new ArrayList();

    }

    public void registerDisplay(Display d){
        Displays.add(d);

    }

    public  void removeDisplay(Display d){
        int i = Displays.indexOf(d);
        if (i >= 0){
            Displays.remove(i);
        }
    }

    public void notifyDisplays(){

        for(int i = 0; i < Displays.size(); i++){
            Display display = (Display)Displays.get(i);
            IDisplay.update(coins, lives);

        }
    }

    public void DataChanged(){
        notifyDisplays();
    }

    public  void setChanges(int coins, int lives){
        this.coins = coins;
        this.lives = lives;

    }

    // other methods here

}
