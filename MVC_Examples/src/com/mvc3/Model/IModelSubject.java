package com.mvc3.Model;

public interface IModelSubject {

    void add(IModelObserver observer);
    void remove (IModelObserver observer);
    void updateObservers();
    void setData(String data);
}
