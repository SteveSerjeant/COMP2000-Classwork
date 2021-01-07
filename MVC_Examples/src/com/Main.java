package com;

//import com.mvc1.*;
//import com.mvc2.*;
import com.mvc3.Model.*;
import com.mvc3.View.*;
import com.mvc3.Controller.*;

import java.lang.reflect.Method;

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
        model.setData("Bob Bobbington");

//            String data = model.getData();
//
//        try {
//
//            System.out.println(model.getClass());
//
//                Method getData = model.getClass().getMethod("getData");
//                Object value = getData.invoke(model);
//
//                System.out.println(value.toString());
//
//            Method[] methods = model.getClass().getDeclaredMethods();
//
//            for (Method method : methods){
//                System.out.println(method.getName());
//            }
//            String propertyName = "Description";
//
//            Method method = model.getClass().getMethod("get" + propertyName);
//            //Object value = method.invoke(model);
//
//            System.out.println(value);
//        }
//        catch(Exception ex){
//
//            ex.printStackTrace();
//        }

        IControllerStrategy settingsController = new ControllerStrategy(model, new ViewUserSettings());

        IControllerStrategy displayController = new ControllerStrategy(model, new ViewUserDisplay());
    }
}
