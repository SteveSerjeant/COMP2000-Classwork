package com;

public class Truck {

    private int numWheels = 80;
    private float speed = 0;

    public void drive(){
        System.out.println("Driving car with " + numWheels + " wheels");
        calculateSpeed();
    }

    private void calculateSpeed() {
        System.out.println("Moving at " + speed + " speed");
    }

    public void setNumWheels(int newWheels){
        numWheels = newWheels;
    }

    public void setSpeed(float newSpeed){
        speed = newSpeed;
    }

    public int getNumWheels(){
        return numWheels;
    }

}


