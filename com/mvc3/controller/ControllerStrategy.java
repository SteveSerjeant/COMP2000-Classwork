package com.mvc3.controller;

import com.mvc3.model.IModelObserver;
import com.mvc3.model.IModelSubject;
import com.mvc3.view.IViewComposite;

public class ControllerStrategy implements IControllerStrategy, IModelObserver {

    private IModelSubject modelSubject;
    private IViewComposite viewComposite;

    public ControllerStrategy(IModelSubject modelSubject, IViewComposite viewComposite) {
        this.modelSubject = modelSubject;
        this.viewComposite = viewComposite;

        this.modelSubject.add(this);
        this.viewComposite.setController(this);
    }

    @Override
    public void update(String data) {
        viewComposite.display(data);
    }

    @Override
    public void setData(String data) {
        modelSubject.setData(data);
        modelSubject.updateObservers();
    }
}
