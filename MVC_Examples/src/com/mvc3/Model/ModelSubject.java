package com.mvc3.Model;
import java.util.ArrayList;

public class ModelSubject implements IModelSubject{

    private String data;

    private String description = "Model Description.....";

    public  String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
    private final ArrayList<IModelObserver> observers = new ArrayList<>();

    public String getData(){

        return data;
    }

    @Override
    public void setData(String data){

        this.data = data;
    }

    @Override
    public void add(IModelObserver observer){

        observers.add(observer);
    }

    @Override
    public void remove(IModelObserver observer){

        observers.remove(observer);
    }

    @Override
    public void updateObservers(){

        for(IModelObserver observer : observers){

            observer.update(data);
        }
    }

}
