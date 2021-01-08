package com.mvc4.controller;

import com.mvc4.KeyValuepair;
import com.mvc4.model.IModelSubject;
import com.mvc4.view.AbstractView;
import java.lang.reflect.Method;

public class ControllerStrategy extends AbstractController{

    IModelSubject model;
    AbstractView view;

    private final Method[] modelMethods;

    public ControllerStrategy(IModelSubject newModel, AbstractView newView){
        model = newModel;
        view = newView;

        model.add(this);
        view.setController(this);

        modelMethods = model.getClass().getDeclaredMethods();
    }

    @Override
    public void setModelProperty(KeyValuePair data){

        try {
            String methodName = "set" + data.key;
            for(Method method : modelMethods){
                if (method.getName().equals(methodName)){
                    method.invoke(model, data.value);
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void updateView (KeyValuePair data){
        view.update(data);
    }
}
