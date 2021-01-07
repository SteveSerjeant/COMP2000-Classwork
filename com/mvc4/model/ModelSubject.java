package com.mvc4.model;

import com.mvc4.KeyValuePair;
import com.mvc4.controller.AbstractController;

import java.util.ArrayList;

public class ModelSubject implements IModelSubject {
    private String characterName = "";
    private int health = 0;
    private int armour;
    private float walkSpeed;
    private float runSpeed;
    private float jumpHeight;

    private final ArrayList<AbstractController> observers = new ArrayList<>();

    @Override
    public void add(AbstractController observer) {
        observers.add(observer);
    }

    @Override
    public void remove(AbstractController observer) {
        observers.remove(observer);
    }


    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
        onPropertyChanged(new KeyValuePair(AbstractController.CHARACTER_NAME, this.characterName));
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
        onPropertyChanged(new KeyValuePair(AbstractController.HEALTH, this.health));
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
        onPropertyChanged(new KeyValuePair(AbstractController.ARMOUR, this.armour));
    }

    public float getWalkSpeed() {
        return walkSpeed;
    }

    public void setWalkSpeed(float walkSpeed) {
        this.walkSpeed = walkSpeed;
        onPropertyChanged(new KeyValuePair(AbstractController.WALK_SPEED, this.walkSpeed));
    }

    public float getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(float runSpeed) {
        this.runSpeed = runSpeed;
        onPropertyChanged(new KeyValuePair(AbstractController.RUN_SPEED, this.runSpeed));
    }

    public float getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
        onPropertyChanged(new KeyValuePair(AbstractController.JUMP_HEIGHT, this.jumpHeight));
    }

    @Override
    public void onPropertyChanged(KeyValuePair data) {
        for(AbstractController observer : observers) {
            observer.updateView(data);
        }
    }
}
