package com;

public class Login {

    //DATA
    public String password = "pass";
    public String userName = "bob";

    public void login(){

        //INSTRUCTIONS
        System.out.println("Checking password...");
        if (password == "pass" && userName == "bob"){

            System.out.println("Logging in " + userName);
        }
        else {
            System.out.println("Incorrect password or username");
        }

    }
}
