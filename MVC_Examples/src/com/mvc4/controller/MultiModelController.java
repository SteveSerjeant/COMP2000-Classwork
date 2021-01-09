package com.mvc4.controller;

import com.mvc4.KeyValuePair;
import com.mvc4.model.IModelSubject;
import com.mvc4.view.AbstractView;


import java.lang.reflect.Method;

public class MultiModelController extends AbstractController {

    IModelSubject[] models;
    AbstractView view;

    IModelSubject currentModel;

    private Method[] modelMethods;

    public MultiModelController(IModelSubject[] models, AbstractView view) {
        this.models = models;
        this.view = view;

        currentModel = models[0];

        currentModel.add(this);
        view.setController(this);

        modelMethods = currentModel.getClass().getDeclaredMethods();

        setupModel();

    }

    @Override
    public void swapModel(int index) {
        if (index >= 0 && index < models.length) {
            if (currentModel != models[index]) {

                currentModel.remove(this);

                currentModel = models[index];
                currentModel.add(this);

                modelMethods = currentModel.getClass().getDeclaredMethods();
            }
        }
        setupModel();

    }

    private void setupModel() {
        try {
            for (Method method : modelMethods) {
                if (method.getName().equals("get" + CHARACTER_NAME)) {
                    Object value = method.invoke(currentModel);
                    updateView(new KeyValuePair(CHARACTER_NAME, (String) value));
                } else if (method.getName().equals("get" + HEALTH)) {
                    Object value = method.invoke(currentModel);
                    updateView(new KeyValuePair(HEALTH, (int) value));
                } else if (method.getName().equals("get" + ARMOUR)) {
                    Object value = method.invoke(currentModel);
                    updateView(new KeyValuePair(ARMOUR, (int) value));
                } else if (method.getName().equals("get" + WALK_SPEED)) {
                    Object value = method.invoke(currentModel);
                    updateView(new KeyValuePair(WALK_SPEED, (float) value));
                } else if (method.getName().equals("get" + RUN_SPEED)) {
                    Object value = method.invoke(currentModel);
                    updateView(new KeyValuePair(RUN_SPEED, (float) value));
                } else if (method.getName().equals("get" + JUMP_HEIGHT)) {
                    Object value = method.invoke(currentModel);
                    updateView(new KeyValuePair(JUMP_HEIGHT, (float) value));
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void setModelProperty (KeyValuePair data){
        try{
            String methodName = "set" + data.key;
            for(Method method : modelMethods){
                if (method.getName().equals(methodName)){
                    method.invoke(currentModel, data.value);
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void updateView(KeyValuePair data){
        view.update(data);
    }
}

