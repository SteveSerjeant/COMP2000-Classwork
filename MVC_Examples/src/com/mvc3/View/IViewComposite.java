package com.mvc3.View;

import com.mvc3.Controller.IControllerStrategy;

public interface IViewComposite {

    String getName();
    void display(String data);
    void setController(IControllerStrategy controller);
}
