package com;

import com.mvc1.*;
//import com.mvc2.*;

//import com.mvc3.model.*;
//import com.mvc3.view.*;
//import com.mvc3.controller.*;

//import java.lang.reflect.Method;


//import com.mvc4.controller.*;
//import com.mvc4.model.*;
//import com.mvc4.view.*;

public class Main {

    public static void main(String[] args) {

        /* level 1 */
        App app = new App();

        /* level 2 */
//        Model model = new Model();
////
//        EditView editView = new EditView();
//        Controller editController = new Controller(model, editView);
//
//        DisplayView displayView = new DisplayView();
//        Controller displayController = new Controller(model, displayView);

        /* level 3 */
//        IModelSubject model = new ModelSubject();
//        model.setData("Bob Bobbington");
//
////        String data = model.getData();
//
//        try {
////            System.out.println(model.getClass());
//
////              Method getData = model.getClass().getMethod("getData");
////              Object value = getData.invoke(model);
////
////              System.out.println(value.toString());
//
////            Method[] methods = model.getClass().getDeclaredMethods();
////
////            for(Method method : methods) {
////                System.out.println(method.getName());
////            }
//
//            String propertyName = "Description";
//
//            Method method = model.getClass().getMethod("get" + propertyName);
//            Object value = method.invoke(model);
//
//            System.out.println(value);
//
//        }
//        catch(Exception ex) {
//            ex.printStackTrace();
//        }


//        IControllerStrategy settingsController = new ControllerStrategy(model, new ViewUserSettings());
//
//        IControllerStrategy displayController = new ControllerStrategy(model, new ViewUserDisplay());

        /* level 4 */
//        ModelSubject model = new ModelSubject();
//
//
//        AbstractView editorView = new ViewEditor();
//        AbstractController controller = new ControllerStrategy(model, editorView);
//
//        AbstractView characterView = new ViewCharacterDetails();
//        AbstractController controller2 = new ControllerStrategy(model, characterView);
//
//        AbstractView viewAll = new ViewAll();
//        AbstractController controller3 = new ControllerStrategy(model, viewAll);
//
//
//        model.setCharacterName("Fred");
//        model.setHealth(7);
//        model.setArmour(1);
//        model.setWalkSpeed(3.75f);
//        model.setRunSpeed(7.5f);
//        model.setJumpHeight(1.2f);
//

        /* level 5 */
//        ModelSubject[] models = new ModelSubject[3];
//
//        models[0] = new ModelSubject();
//        models[0].setCharacterName("Steve");
//
//        models[1] = new ModelSubject();
//        models[1].setCharacterName("Pete");
//
//        models[2] = new ModelSubject();
//        models[2].setCharacterName("Dave");
//
//        String[] names = new String[3];
//        for (int i = 0; i < names.length; i++) {
//            names[i] = models[i].getCharacterName();
//        }
//
//        App appView = new App();
//        AbstractController controller4 = new MultiModelController(models, appView);
//
//        appView.setupEditorList(names);


    }
}
