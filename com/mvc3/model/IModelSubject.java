package com.mvc3.model;

public interface IModelSubject {
    void add(IModelObserver observer);
    void remove(IModelObserver observer);
    void updateObservers();
    void setData(String data);
}
