package com;


public class Main {

    public static void main(String[] args) {
	// write your code here
        //For encapsulation exercise
        //String userName = "bob";
        //String password = "pass";

        Login myLogin = new Login();
        myLogin.userName = "steve";
        myLogin.password = "pass";
        myLogin.login();

        Truck truck = new Truck();
        System.out.println(truck.getNumWheels());
        truck.setNumWheels(10);
        truck.setSpeed(60.5f);
        truck.drive();

        Suitcase mySuitcase = new Suitcase(2);
        mySuitcase.addItem();
        mySuitcase.addItem();
        mySuitcase.returnItem();
        mySuitcase.returnItem();
        mySuitcase.returnItem();

    }
 /*   static void logIn(String pass, String user){
        *//* INSTRUCTIONS *//*
        String password = pass;
        String userName = user;

        System.out.println("Checking password...");
        if (password == "pass" && userName == "bob"){

            System.out.println("Logging in " + userName);
        }
        else {
            System.out.println("Incorrect password or username");
        }

    }*/

}
