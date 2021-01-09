package com.mvc4.controller;

import com.mvc4.KeyValuePair;

public abstract class AbstractController {

    public static final String CHARACTER_NAME = "CharacterName";
    public static final String HEALTH = "Health";
    public static final String ARMOUR = "Armour";
    public static final String WALK_SPEED = "WalkSpeed";
    public static final String RUN_SPEED = "RunSpeed";
    public static final String JUMP_HEIGHT = "JumpHeight";

    public abstract void setModelProperty(KeyValuePair data);
    public abstract void updateView (KeyValuePair data);

    public void swapModel(int index) { }

}
