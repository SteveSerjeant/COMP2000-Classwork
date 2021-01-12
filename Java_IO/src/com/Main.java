package com;

import com.demo.User;
import com.demo.UserDataManager;

import java.io.File;

public class Main {

    public static void main(String[] args){

        String message = "Hello Steve!";
        System.out.println(message);
//        User newUser = new User();
        System.out.println(sayHello());

        File file = new File("resources\\data.txt");

        if (file.exists()){
            System.out.println("Name: " + file.getName());
            System.out.println(("Hard drive location: " + file.getAbsolutePath()));
            System.out.println("Can read file: " + file.canRead());
            System.out.println("Can write to file:" + file.canWrite());
            System.out.println("File size (bytes): " + file.length());

        }

        else {
            System.out.println("The file does not exist.");
        }

        UserDataManager userManager = new UserDataManager();

        userManager.load();


        /*  edit existing user */

//        User user = userManager.getUserAt(0);
//        user.setName("Steve");
//        user.setAge(55);
//        user.setBalance(9999.99f);
//        user.setPlatinumAccount(true);

//        /* adding a new user */
//        User user = new User();
//        user.setName("Rose");
//        user.setAge(30);
//        user.setBalance(8990.53f);
//        user.setPlatinumAccount(false);
//
//        userManager.addUser(user);

        /* remove an existing user */

        User userToRemove = userManager.getUserAt(2);
        userManager.removeUser(userToRemove);


        userManager.save();
    }
////methods added to try creating tests - all work
    public static String sayHello(){

        return "Hello World!";
    }


    public int addNumbers(int a, int b){
        return a+b;
    }

    public String addStrings(String c, String d){
        return c+d;
    }



    




}
