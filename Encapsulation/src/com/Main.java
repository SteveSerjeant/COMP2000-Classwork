package com;

public class Main {

    public static void main(String[] args) {


        /* DATA */
        String userName = "bob";
        String password = "pass";

        //logIn("pass", "user");
        //* INSTRUCTIONS *//*
/*        System.out.println("Checking password...");
        if (password == "pass" && userName == "bob"){

            System.out.println("Logging in " + userName);
        }
        else {
            System.out.println("Incorrect password or username");
        }*/
        logIn(password, userName);

    }
    static void logIn(String pass, String user){
        /* INSTRUCTIONS */
        String password = pass;
        String userName = user;

        System.out.println("Checking password...");
        if (password == "pass" && userName == "bob"){

            System.out.println("Logging in " + userName);
        }
        else {
            System.out.println("Incorrect password or username");
        }

    }
}
