package com.mvc2;

public class Controller {
    private Model model;
    private IView view;

    public Controller(Model model, IView view) {
        this.model = model;
        this.view = view;

        view.setController(this);
    }

    public void setName(String name) {
        model.setName(name);
    }

   public void updateView() {
        view.setName(model.getName());
   }

}
