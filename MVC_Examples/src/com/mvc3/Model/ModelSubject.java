package com.mvc3.Model;
import java.util.ArrayList;

public class ModelSubject implements IModelSubject{

    private String data;
    private final ArrayList<IModelObserver> observers = new ArrayList<>();

    public String getData(){

        return data;
    }

    public void setData(String data){

        this.data = data;
    }

    public void add(IModelObserver observer){

        observers.add(observer);
    }

    public void remove(IModelObserver observer){

        observers.remove(observer);
    }

    public void updateObservers(){

        for(IModelObserver observer : observers){

            observer.update(data);
        }
    }

}
