package com.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserDataManager {

    public String filepath = "resources\\data.txt";
    public String separator = "\\|";

    private final ArrayList<User> users = new ArrayList<>();

    public void load(){

        try {
            File file = new File(filepath);

            Scanner scanner = new Scanner(file);

            while ( scanner.hasNextLine()){
                String tableRow = scanner.nextLine();

                String[] userdata = tableRow.split(separator);

                User user = new User();

                user.setName(userdata[0]);

                int ageToInt = Integer.parseInt(userdata[1]);
                user.setAge(ageToInt);

                float balanceToFloat = Float.parseFloat(userdata[2]);
                user.setBalance(balanceToFloat);

                boolean platinumToBoolean = Boolean.parseBoolean(userdata[3]);
                user.setPlatinumAccount(platinumToBoolean);

                users.add(user);

            }
            scanner.close();
            System.out.println("User file successfully loaded.");
            System.out.println(users.size());



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void save(){
        try{
            FileWriter writer = new FileWriter(filepath);

            for(int i = 0; i < users.size(); i++){
                String dataRow = "";

                if(i> 0){
                    dataRow += "\n";
                }

                dataRow += users.get(i).getName();

                String ageToString = Integer.toString(users.get(i).getAge());
                dataRow += "|" + ageToString;

                String balanceToString = Float.toString(users.get(i).getBalance());
                dataRow += "|" + balanceToString;

                String platinumToString = Boolean.toString(users.get(i).isPlatinumAccount());
                dataRow += "|" + platinumToString;

                writer.write(dataRow);

            }

            writer.close();
            System.out.println("User file successfully saved.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public User getUserAt(int index){

        if (index >= users.size()){
            return null;
        }
        return users.get(index);
    }
    public void addUser(User newUser){
        users.add(newUser);
    }

    public void removeUser(User oldUser){
        users.remove(oldUser);
    }

}
