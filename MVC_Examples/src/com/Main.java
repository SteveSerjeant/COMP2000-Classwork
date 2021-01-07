package com;

//import com.mvc1.*;
//import com.mvc2.*;
import com.mvc3.Model.*;
import com.mvc3.View.*;
import com.mvc3.Controller.*;

public class Main {

    public static void main (String[] args){

        /* level 1 */
//        App app = new App();

        /* level 2 */
//        Model model = new Model();
//
//        EditView editView = new EditView();
//        Controller editController = new Controller(model, editView);
//
//        DisplayView displayView = new DisplayView();
//        Controller displayController = new Controller(model, displayView);

        /*  level 3 */
        IModelSubject model = new ModelSubject();

        IControllerStrategy settingsController = new ControllerStrategy(model, new ViewUserSettings());

        IControllerStrategy displayController = new ControllerStrategy(model, new ViewUserDisplay());
    }
}
