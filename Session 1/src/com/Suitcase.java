package com;

public class Suitcase {

    private  int maxItemCount;
    private int currentItems;

    public Suitcase (int maxItemsAllowed){
        maxItemCount = maxItemsAllowed;
        currentItems = 0;
        System.out.println(" **Suitcase System**");
        display();
    }

    public void addItem(){
        if (currentItems + 1 <= maxItemCount){
            currentItems++;
            System.out.println("Adding item");
            display();
        }
        else{
            System.out.println("no more items can be added, the suitcase is full!");
        }

    }

    public void returnItem(){
        if (currentItems - 1 >= 0){
            currentItems--;
            System.out.println("Removing item");
            display();
        }
        else{
            System.out.println("no more items can be added, the suitcase is full!");
        }
    }

    private void display(){
        System.out.println("Items: " + currentItems + "/" + maxItemCount);
    }
}
