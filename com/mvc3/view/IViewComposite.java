package com.mvc3.view;

import com.mvc3.controller.IControllerStrategy;

public interface IViewComposite {
    String getName();
    void display(String data);
    void setController(IControllerStrategy controller);
}
